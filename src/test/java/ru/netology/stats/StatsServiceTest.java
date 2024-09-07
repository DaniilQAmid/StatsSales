package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void correctSumAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAllSales = 180;
        long actualAllSales = service.sumAllSales(sales);

        Assertions.assertEquals(expectedAllSales, actualAllSales);
    }

    @Test
    public void correctAverageSalesAmount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverageSales = 15;
        long actualAverageSales = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test
    public void shouldFindBetweenEndsMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxMonth = 6;
        long actualMaxMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldFindBetweenEndsMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxMonth = 9;
        long actualMaxMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldFoundBetweenEndsSaleBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedFewSales = 7;
        long actualFewSales = service.salesBelowAverage(sales);

        Assertions.assertEquals(expectedFewSales, actualFewSales);
    }

    @Test
    public void mustFoundBetweenEndsAboveAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAboveSales = 5;
        long actualAboveSales = service.salesAboveAverage(sales);

        Assertions.assertEquals(expectedAboveSales, actualAboveSales);
    }
}
