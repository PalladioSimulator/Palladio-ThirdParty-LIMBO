/*******************************************************************************
 * Copyright (c) 2014 Benno Heilmann, Joakim von Kistowski
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package tools.descartes.dlim.extractor;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.math3.analysis.function.Gaussian;
import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import tools.descartes.dlim.Sequence;
import tools.descartes.dlim.extractor.dialogs.LaunchExtractionDialogWithAutocorrelation;
import tools.descartes.dlim.generator.ArrivalRateTuple;


/**
 * Extracts a DLIM instance based on the Simple Extraction Model.
 *
 * @author Benno Heilmann, Joakim von Kistowski
 */
public class SimpleProcessExtractorAutocorrelation implements IDlimExtractor {
	//EXPECTEDMAXPEAKSPERSEASONAL kopiert aus ModelExtractor
	private static final int EXPECTEDMAXPEAKSPERSEASONAL = 8;
	static int numberOfCorrAndLags=200;
	static double[] corrSaver=new double[numberOfCorrAndLags];

	/**
	 * Extracts a DLIM instance based on the Simple Extraction Model.
	 *
	 * @param root the root
	 * @param readArrivalRates the read arrival rates
	 */
	@Override
	public void extractIntoSequence(Sequence root,
			List<ArrivalRateTuple> arrList) {
		
		//getPeriodFromAutocorr() errechnet mit Hilfe von Autokorrelationen
		//eine Periode
		int lagOfMax=getPeriodFromAutocorr( arrList);
		
		
		//hier kann ich coden
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getShell();
		
		LaunchExtractionDialogWithAutocorrelation dialog = new LaunchExtractionDialogWithAutocorrelation(shell, root,
				arrList);
		
		//Falls die Periode (lagOfMax) gut genug
		//(Erklärung in der Methode periodGood)ist,
		//kann man sie setzen
		if(periodGood(corrSaver,lagOfMax)){
			dialog.setSeasonalPeriod(lagOfMax);
		}
		
		//falls die Periode nicht ausreichend gut ist,
		//muss man das gleiche Verfahren für den
		//mit einem Gauss-Filter geglätteten
		//Trace betrachten.
		else{
			System.out.println(" ");
			System.out.println("normales Verfahren mit Autokorrelation war nicht ausreichend.");
			System.out.println("Führe eine Glättung mit Gaußfilter durch");
			System.out.println("und wiederhole das Verfahren");
			System.out.println(" ");
			//Kopiere Tracedaten in eine neue Liste arrListGauss und führe dort
			//die Glättung mit dem Gauß-Filter durch.
			List<ArrivalRateTuple>arrListGauss= arrList;
			reduceArrivalRateListNoise(arrListGauss, lagOfMax);
			//System.out.println(arrList.toString());
			//lagOfMax wird jetzt überschrieben (hoffentlich mit einer besseren Periode)
			//corrSaver wurde auch bei den Berechnungen in reduceArrivalRateListNoise
			//überschrieben. Aber diese Überschreibungen sind ok, weil wir in diesem
			//Fall entweder die Periode von der geglätteten Liste nehmen 
			//oder wenn alle Stricke reißen seasonalPeriod auf den Standardwert 24 setzen.
			lagOfMax=getPeriodFromAutocorr( arrListGauss);
			
			//Periode gut? falls ja kann man sie setzen, sonst
			//wird jetzt der Standardwert gesetzt.
			if(periodGood(corrSaver,lagOfMax)){
				dialog.setSeasonalPeriod(lagOfMax);
			}
			else{
				dialog.setSeasonalPeriod(24);
			}
		}
		

		dialog.open();

		
	}
	
	
	//copied 4 methods that have to do with Gauß-Filter from ModelExtractor
	
	/*
	 * Create a gaussian filter with a given kernel width.
	 */
	private static double[] createGaussianFilter(int width) {
		int filterWidth = width;
		if (filterWidth % 2 == 0) {
			filterWidth++;
		}
		filterWidth = Math.max(1, filterWidth);
		double[] filter = new double[filterWidth];
		double sigma = Math.sqrt((filterWidth * filterWidth - 1.0) / 12.0);
		int mean = filterWidth / 2;
		double filterSum = 0.0;
		Gaussian gaussian = new Gaussian(mean, sigma);
		for (int i = 0; i < filterWidth; i++) {
			filter[i] = gaussian.value(i);
			filterSum += filter[i];
		}

		// normalize to 1
		for (int i = 0; i < filterWidth; i++) {
			filter[i] = filter[i] / filterSum;
		}

		return filter;
	}
	
	/*
	 * Reduce noise within the read arrival rate list by applying a gaussian
	 * filter.
	 */
	public static void reduceArrivalRateListNoise(List<ArrivalRateTuple> arrList, int lagOfMax) {
		//double[] filter = createGaussianFilter((int) (lagOfMax / EXPECTEDMAXPEAKSPERSEASONAL));
		double[] filter = createGaussianFilter(9);
		double[] arrivalRates = new double[arrList.size()];
		int index = 0;
		for (ArrivalRateTuple t : arrList) {
			arrivalRates[index] = t.getArrivalRate();
			index++;
		}
		index = 0;
		for (ArrivalRateTuple t : arrList) {
			t.setArrivalRate(getFilteredValueAtIndex(arrivalRates, index,
					filter));
			index++;
		}
	}
	/*
	 * Apply gaussian filter to arrival rate at index index.
	 */
	private static double getFilteredValueAtIndex(double[] arrivalRateArray,
			int index, double[] filter) {
		int filterCenter = filter.length / 2;

		double filteredValue = 0.0;
		for (int i = 0; i < filter.length; i++) {
			filteredValue += filter[i]
					* getArrivalRateFromArray(arrivalRateArray, index
							+ (i - filterCenter));
		}
		return filteredValue;
	}
	
	
	/*
	 * Comfort function. Returns 0 for out of bound array indices.
	 */
	private static double getArrivalRateFromArray(double[] array, int index) {
		if (index < 0 || index >= array.length) {
			return 0.0;
		}
		return array[index];
	}
	
	//Bestimmt mit Autokorrelation einen Kandidaten für die Periode.
	private static int getPeriodFromAutocorr(List<ArrivalRateTuple> arrList){
		
		
		
				//Abschnitt: Autokorrelation zum bestimmen von dominanten Perioden
				
						
						
						double [] arrRateArray=new double[arrList.size()];
						//befülle Array nun mit den Daten aus der Liste.
						int j=0;//Zählvariable für das Array
						for(ArrivalRateTuple art: arrList){
							arrRateArray[j]=art.getArrivalRate();
							j++;
						}
						
						// weiteres Array zum Befüllen mit Daten
						//aus der Liste arrList zu verschiedenen Lags k.
						double [] arrRateArrayLag=new double[arrList.size()];
						//zum Speicher der Korrelationswerte. (Später suchen wir den größten
						//Korrelationswert und
						//probieren Vielfache von ihm aus)
						
						//k ist Lag-Variable. Wir versuchen mehrere Lags aus
						//und suchen Korrelation zwischen Original-Trace
						//und Lag-Trace nahe dem Wert 1.
						for(int k=0;k<numberOfCorrAndLags;k++){
							int l=0;//Zählvariable für das Array
							for(ArrivalRateTuple art: arrList){
									arrRateArrayLag[(l+k)%(arrList.size())]=art.getArrivalRate();
								l++;
							}
							
							//compute Pearson product-moment correlation coefficient.
							//(A number in the intervall [-1,1])
							PearsonsCorrelation corr=new PearsonsCorrelation();
							double correlationTraceLagTrace=corr.correlation(arrRateArray, arrRateArrayLag);
							//speicher Korrelationswert im Array
							corrSaver[k]=correlationTraceLagTrace;
							
						}
						//lokale Maxima in corrSaver die größer
						//als Nachbarn in range (zweites Argument) sind
						findLocalMaxima(corrSaver,5);
						
						//Variablen zum Speichern der maximalen Korrelation
						// und des zugehörigen Lags
						double maxCorr=0;
						int lagOfMax=0;
						//zu geringe Lags produzieren hohe Korrelationen wegen zu großer Ähnlichkeit
						//zum ursprünglichen Trace. Deswegen Start bei Lag k=10.
						//29.05.16 schaue traces an und versuche nun startlag 75, weil
						// das globale maxima in den Korrelationen häufig von der Ähnlichkeit der
						// Traces bei geringem Lag rührt
						for(int k=10;k<corrSaver.length;k++){
							if(corrSaver[k]>maxCorr){
								maxCorr=corrSaver[k];
								lagOfMax=k;
							}
						}
						
						System.out.println("maximale Korrelation bei Lag "+lagOfMax+" entspricht "+maxCorr);
						
						//liefern Vielfache des Lags der maximalen Korrelation auch hohe Korrelationswerte?
						for(int i=1;i<10;i++){
							System.out.println("Korrelation bei "+i+"-fachen Lag");
							System.out.println("corrSaver[lagOfMax*"+ i+"] ="
									+ " "+corrSaver[(lagOfMax*i)%corrSaver.length]);
						}
						
						
						
						
						return lagOfMax;
	}
	
	
	
	
	//bekommt in corrSaver alle Korrelationen übergeben, wobei
	//corrSaver[k] der Korrelation zwischen normalem Trace und Trace
	// mit Lag k entspricht
	private static boolean periodGood(double[] corrSaver, int lagOfMax ){
		//Prüfung ob Lag gut gewählt ist.
				//Es wird geprüft ob der errechnete Lag und seine k-fachen mit 0<k<6
				// zu Korrelationen> 50% führen.
//				Unter diesem  Kriterium benutzen zum Beispiel der wikipedia_trace,
//				der ru.wikipedia.org_trace und der WorldCup98_trace die durch die Autokorrelation
//				errechnete Periode, während bibsonomy_2011_05-07_nospammer und
//				IBM_Transactions_S-MIEP_Trendlength1_Noise_ignored den Standardwert 24 für
//				seasonalPeriod nutzen.
				for(int k=1;k<6;k++){
					if(corrSaver[(lagOfMax*k)%corrSaver.length]<=0.50){
					
						return false;
					}
				}
		
		return true;
	}
	
	//finds up to 20 local maxima that are bigger then their neighbours in range 10
	public static double[][] findLocalMaxima(double[] corrSaver, int range){
		
		//Größe 21 weil 21=2*range+1 (range=10)
		double[]window=new double[2*range+1];
		//speichert die gefundenen lokalen Maxima und ihre Lags
		//lagMax[0] sind lags, lagMax[1] sind zugehörige Maxima
		double[][]lagMax=new double[2][20];
		//zählvariable für lagMax
		int r=0;
		//speichert das momentane Maximum in Window
		double maxCorr=0;
		//Start bei 10, weil range 10
		//Ende bei corrSaver.length-10, weil range 10
		for(int i=range;i<corrSaver.length-range;i++){
			//befülle window
			for(int j=0;j<window.length;j++){
				//corrSaver[i-10+j], weil range 10
				window[j]=corrSaver[i-range+j];
			}
			//ist der Wert in der Mitte von window der größte
			//im window-array?
			//nach der for-Schleife ist der größte Wert von Window in
			//maxCorr gespeichert.
			for(int n=0;n<window.length;n++){
				if(window[n]>maxCorr){
					maxCorr=window[n];
				}
			}
			
			//jetzt noch maxCorr mit window[10] vergleichen. (10 weil range=10)
			//Bei Gleichheit ist window[10] bzw. corrSaver[i-10+j] ein lokales Maximum.
			if(window[range]==maxCorr){
				//der Lag wird abgespeichert
				lagMax[0][r]=i;
				//und der zugehörige Wert des Maximums
				lagMax[1][r]=maxCorr;
				//neuer freier Platz in lagMax für andere Maxima und deren Lag
				r++;
			}
			//maxCorr wieder reseten
			maxCorr=0;
		}
		System.out.println(" ");
		System.out.println("gefundene lokale Maxima an Positionen");
		System.out.println(Arrays.toString(lagMax[0]));
		System.out.println(" ");
		System.out.println("erste lokal maximale Korrelation bei Lag: "+lagMax[0][0]);
		System.out.println(" ");
		
		int countMaxima=0;
		//zählt wie viele lokale Maxima es gibt
		for(int i=0;i<lagMax[0].length;i++){
			
			if(lagMax[0][i]!=0){
				countMaxima++;
			}
			
		}
		
		System.out.println("Die Anzahl lokaler Maxima beträgt: "+countMaxima);
		System.out.println(" ");
		
		return lagMax;
	}
	
	

}