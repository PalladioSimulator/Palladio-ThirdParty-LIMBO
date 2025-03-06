/*******************************************************************************
 * Copyright (c) 2014 Joakim von Kistowski
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package tools.descartes.dlim.impl.custom;

import java.util.ArrayList;
import java.util.List;

import tools.descartes.dlim.calc.ArrivalRatesCalculator;
import tools.descartes.dlim.generator.ArrivalRateTuple;
import tools.descartes.dlim.impl.ArrivalRatesFromFileImpl;
import tools.descartes.dlim.io.ArrivalRatesReader;

/**
 * Custom implementation of ArrivalRatesFromFile. Provides the functionality of reading and getting
 * arrival rates from a file.
 *
 * @author Joakim von Kistowski
 *
 */
public class CustomArrivalRatesFromFileImpl extends ArrivalRatesFromFileImpl {
    // The list of arrival rate tuples, should be filled (using readFile(String
    // projectPath))
    // before getArrivalRate(double x) is called
    private List<ArrivalRateTuple> arrRates;

    /**
     * Constructor.
     */
    protected CustomArrivalRatesFromFileImpl() {
        super();
        arrRates = new ArrayList<>();
    }

    /**
     * Gets the arrival rate at time x from the stored arrival rate array. Uses linear interpolation
     * for arrival rates that do not exactly match the stored points in time.
     */
    @Override
    public double getArrivalRate(double x) {
        ArrivalRatesCalculator arrivalRatesCalculator = new ArrivalRatesCalculator();
        return arrivalRatesCalculator.getArrivalRate(x, arrRates);
    }

    /**
     * Reads an arrival rate file and stores its arrival rate and time-stamp tuples into memory.
     */
    @Override
    public void readFile() {
        ArrivalRatesReader reader = new ArrivalRatesReader();
        arrRates.clear();
        List<ArrivalRateTuple> newArrivalRates = reader.readFile(this);
        arrRates.addAll(newArrivalRates);
    }
}
