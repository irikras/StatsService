package ru.netology.stats;

public class StatsService {

    public long calcAllSales(long[] monthlySales) {
        int sum = 0;
        for (long value : monthlySales) {
            sum += value;
        }
        return sum;
    }

    public double calcAverageMonthlySales(long[] monthlySales) {
        long sum = calcAllSales(monthlySales);

        return (double) sum / monthlySales.length;
    }

    public int maxSales(long[] monthlySales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : monthlySales) {
            if (sale >= monthlySales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int minSales(long[] monthlySales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : monthlySales) {
            if (sale <= monthlySales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calcBelowAverage(long[] monthlySales) {
        double average = calcAverageMonthlySales(monthlySales);
        int month = 0;
        for (long sale : monthlySales) {
            if (sale > average) {
                month++;
            }
        }
        return month;
    }

    public int calcAboveAverage(long[] monthlySales) {
        double average = calcAverageMonthlySales(monthlySales);
        int month = 0;
        for (long sale : monthlySales) {
            if (sale < average) {
                month++;
            }
        }
        return month;
    }
}
