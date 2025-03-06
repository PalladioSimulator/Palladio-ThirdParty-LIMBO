package tools.descartes.dlim.calc;

import java.util.List;

import tools.descartes.dlim.generator.ArrivalRateTuple;

public class ArrivalRatesCalculator {
    public double getArrivalRate(double x, List<ArrivalRateTuple> arrRates) {
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

}
