package ru.netology.stats;

public class StatsService {

    public long sumAllSales(long[] sales) {
        long allSales = 0;
        for (long t : sales) {
            if (t > 0) {
                allSales = t + allSales;
            }
        }
        return allSales;
    }

    public long averageSalesAmount(long[] sales) {
        long allSales = sumAllSales(sales);
        long averageSales = allSales / 12;
        return averageSales;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long salesBelowAverage(long[] sales) {
        long averageSales = averageSalesAmount(sales);
        int fewSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= averageSales) {
                fewSales = fewSales + 1;
            }
        }
        return fewSales;
    }

    public long salesAboveAverage(long[] sales) {
        long averageSales = averageSalesAmount(sales);
        int aboveSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                aboveSales = aboveSales + 1;
            }
        }
        return aboveSales;
    }
}
