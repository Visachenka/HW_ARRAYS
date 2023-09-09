package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testMinMonth() {
        long[] month = new long[]{2, 4, 6, 15, 17, 4, 19, 19, 7, 14, 1, 1};
        StatsService stats = new StatsService();
        Assertions.assertEquals(stats.salesMinMonth(month), 12);
    }

    @Test
    public void testMaxMonth() {
        long[] month = new long[]{2, 4, 6, 15, 17, 4, 19, 19, 7, 14, 1, 1};
        StatsService stats = new StatsService();
        Assertions.assertEquals(stats.salesMaxMonth(month), 8);
    }

    @Test
    public void testSalesSummary() {
        long[] month = new long[]{2, 4, 6, 15, 17, 4, 19, 19, 7, 14, 1, 1};
        StatsService stats = new StatsService();
        Assertions.assertEquals(stats.salesSummary(month), 109);
    }

    @Test
    public void testSalesAverage() {
        long[] month = new long[]{2, 4, 6, 15, 17, 4, 19, 19, 7, 14, 1, 1};
        StatsService stats = new StatsService();
        Assertions.assertEquals(stats.salesAverage(month), 9);
    }


    @Test
    public void testMonthsBelowAverage() {
        long[] month = new long[]{2, 4, 6, 15, 17, 4, 19, 19, 7, 14, 1, 1};
        StatsService stats = new StatsService();
        Assertions.assertEquals(stats.monthBelowAverage(month), 7);
    }

    @Test
    public void testMonthsAboveAverage() {
        long[] month = new long[]{2, 4, 6, 15, 17, 4, 19, 19, 7, 14, 1, 1};
        StatsService stats = new StatsService();
        Assertions.assertEquals(stats.monthAboveAverage(month), 5);
    }
}