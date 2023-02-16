package ru.netology.MvnStatsServiceHomeWork.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSumAllMonthsNegativ() {
        StatsService service = new StatsService();

        long[] salesMonths = {8, 0, -2, -10, 17, 5, 19, -9, 7, 14, 14, 18};

        double expectedSum = 81;
        double actualSum = service.salesAllMonths(salesMonths);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldSumAllMonthsZero() {
        StatsService service = new StatsService();

        long[] salesMonths = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        double expectedSum = 0;
        double actualSum = service.salesAllMonths(salesMonths);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldMiddleSumAllMonths() {
        StatsService service = new StatsService();

        long[] salesMonths = {8, 0, -2, -10, 17, 5, 19, -9, 7, 14, 14, 18};

        double expectedSum = 6.75;
        double actualSum = service.middleSalesAllMonths(salesMonths);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldMiddleSumAllMonthsZero() {
        StatsService service = new StatsService();

        long[] salesMonths = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        double expectedSum = 0;
        double actualSum = service.middleSalesAllMonths(salesMonths);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFoundBetweenEndsMaxSalesMonths() {
        StatsService service = new StatsService();

        long[] salesMonths = {8, 0, -2, -10, 17, 5, 19, -9, 7, 14, 14, 18};

        int expectedMonths = 12;
        int actualMonths = service.maxSales(salesMonths);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @Test
    public void shouldFoundBetweenEndsMaxSalesMonthsZero() {
        StatsService service = new StatsService();

        long[] salesMonths = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int expectedMonths = 0;
        int actualMonths = service.maxSales(salesMonths);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @Test
    public void shouldFoundBetweenEndsMinSalesMonths() {
        StatsService service = new StatsService();

        long[] salesMonths = {8, 0, -2, -10, 17, 5, 19, -9, 7, 14, 14, 18};

        int expectedMonths = 8;
        int actualMonths = service.minSales(salesMonths);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @Test
    public void shouldFoundBetweenEndsAmountOfMontsWithBelowAverageSales() {
        StatsService service = new StatsService();

        long[] salesMonths = {8, 0, -2, -10, 17, 5, 19, -9, 7, 14, 14, 18};

        int expectedMonths = 5;
        int actualMonths = service.amountOfMontsWithBelowAverageSales(salesMonths);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @Test
    public void shouldFoundBetweenEndsAmountOfMontsWithAboveAverageSales() {
        StatsService service = new StatsService();

        long[] salesMonths = {8, 0, -2, -10, 17, 5, 19, -9, 7, 14, 14, 18};

        int expectedMonths = 7;
        int actualMonths = service.amountOfMontsWithAboveAverageSales(salesMonths);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }
}
