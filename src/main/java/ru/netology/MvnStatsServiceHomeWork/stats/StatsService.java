package ru.netology.MvnStatsServiceHomeWork.stats;

public class StatsService {

    public double salesAllMonths(long[] salesMonths) {
        long sum = 0;
        for (long salesMonth : salesMonths) {
            sum = sum + salesMonth;
        }
        return sum;
    }

    public double middleSalesAllMonths(long[] salesMonths) {
        double middleSales = salesAllMonths(salesMonths) / 12;
        return middleSales;
    }

    public int maxSales(long[] salesMonts) {
        int maxSalesMonth = 0;
        for (int i = 0; i < salesMonts.length; i++) {
            if (salesMonts[i] > salesMonts[maxSalesMonth]) {
                maxSalesMonth = i + 1;
            }
        }
        return maxSalesMonth;
    }

    public int minSales(long[] salesMonts) {
        int minSalesMonth = 0;
        for (int i = 0; i < salesMonts.length; i++) {
            if (salesMonts[i] < salesMonts[minSalesMonth]) {
                minSalesMonth = i + 1;
            }
        }
        return minSalesMonth;
    }

    public int amountOfMontsWithBelowAverageSales(long[] salesMonts) {
        int amountOfMonts = 0;
        for (long salesMont : salesMonts) {
            if (salesMont < middleSalesAllMonths(salesMonts)) {
                amountOfMonts = amountOfMonts + 1;
            }
        }
        return amountOfMonts;
    }

    public int amountOfMontsWithAboveAverageSales(long[] salesMonts) {
        int amountOfMonts = 0;
        for (long salesMont : salesMonts) {
            if (salesMont > middleSalesAllMonths(salesMonts)) {
                amountOfMonts = amountOfMonts + 1;
            }
        }
        return amountOfMonts;
    }
}
