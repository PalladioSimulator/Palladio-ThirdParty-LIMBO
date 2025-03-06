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
        if (arrRates.size() == 0) {
            return 0.0;
        }

        if (x >= arrRates.get(arrRates.size() - 1)
            .getTimeStamp()) {
            return 0.0;
        } else if (x < arrRates.get(0)
            .getTimeStamp()) {
            if (x >= 0) {
                // interpolate between 0 and first arrival rate value
                return (x / arrRates.get(0)
                    .getTimeStamp()) * arrRates.get(0)
                        .getArrivalRate();
            }
            return 0.0;
        }

        double assumedStep = arrRates.get(0)
            .getStep(null);

        // find the surrounding list elements
        int index = (int) (x / assumedStep);
        if (index >= arrRates.size() - 1) {
            index = arrRates.size() - 2;
        }
        ArrivalRateTuple lower = arrRates.get(index);
        ArrivalRateTuple higher = arrRates.get(index + 1);
        while (x < lower.getTimeStamp()) {
            index--;
            lower = arrRates.get(index);
        }
        while (x >= higher.getTimeStamp()) {
            index++;
            higher = arrRates.get(index + 1);
        }
        lower = arrRates.get(index);
        higher = arrRates.get(index + 1);

        // interpolate result
        return lower.getArrivalRate() + ((x - lower.getTimeStamp()) / (higher.getTimeStamp() - lower.getTimeStamp()))
                * (higher.getArrivalRate() - lower.getArrivalRate());

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
