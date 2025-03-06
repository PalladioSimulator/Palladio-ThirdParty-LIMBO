package tools.descartes.dlim.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;

import tools.descartes.dlim.ArrivalRatesFromFile;
import tools.descartes.dlim.DlimPlugin;
import tools.descartes.dlim.generator.ArrivalRateTuple;

public class ArrivalRatesReader {
    private static final String PLUGIN_ID = "tools.descartes.dlim";

    public List<ArrivalRateTuple> readFile(ArrivalRatesFromFile arrivalRatesFromFile) {
        List<ArrivalRateTuple> arrRates = new ArrayList<>();

        IPath txtFilePath = new Path(arrivalRatesFromFile.getFilePath()
            .trim());

        try (BufferedReader br = new BufferedReader(new FileReader(txtFilePath.toString()))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.substring(0, line.length() - 1);
                String[] numbers = line.split(",");
                if (numbers.length >= 2) {
                    double timeStamp = Double.parseDouble(numbers[0].trim());
                    double readArrivalRate = Double.parseDouble(numbers[1].trim());
                    arrRates.add(new ArrivalRateTuple(timeStamp, readArrivalRate));
                }
            }

            return arrRates;
        } catch (IOException e) {
            DlimPlugin.INSTANCE.log(new Status(Status.ERROR, PLUGIN_ID, "Arrival Rate File does not exist.", e));
            return Collections.emptyList();
        }

    }
}
