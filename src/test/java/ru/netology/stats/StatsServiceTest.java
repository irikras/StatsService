package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    long[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldCalcAllSales() {
        StatsService service = new StatsService();

        long actual = service.calcAllSales(monthlySales);
        long expected = 180;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcAverageMonthlySales() {
        StatsService service = new StatsService();

        double actual = service.calcAverageMonthlySales(monthlySales);
        long expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthlyMaxSales() {
        StatsService service = new StatsService();

        long actual = service.maxSales(monthlySales);
        long expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthlyMinSales() {
        StatsService service = new StatsService();

        long actual = service.minSales(monthlySales);
        long expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMonthsBelowAverage() {
        StatsService service = new StatsService();

        long actual = service.calcBelowAverage(monthlySales);
        long expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMonthsAboveAverage() {
        StatsService service = new StatsService();

        long actual = service.calcAboveAverage(monthlySales);
        long expected = 5;

        assertEquals(expected, actual);
    }
}