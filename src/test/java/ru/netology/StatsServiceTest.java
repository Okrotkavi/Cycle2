package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] sales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();
        int[] sales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.averageValue(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinMonth() {
        StatsService service = new StatsService();
        int[] sales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxMonth() {
        StatsService service = new StatsService();
        int[] sales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthBelowAverage(sales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateMonthAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthAboveAverage(sales);
        assertEquals(expected, actual);

    }

}
