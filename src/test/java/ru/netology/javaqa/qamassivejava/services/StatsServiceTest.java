package ru.netology.javaqa.qamassivejava.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test

    public void countAmount() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmount = 180;
        int actualAmount = service.AmountAllSales(stats);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test

    public void countAverage() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        int actualAverage = service.AverageAmount(stats);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test

    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMax = 6;
        int actualMax = service.MaxSales(stats);

        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test

    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMin = 9;
        int actualMin = service.MinSales(stats);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test

    public void countAmountMonthUnderAverage() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmountUnderAverage = 5;
        int actualAmountUnderAverage = service.AmountMonthUnderAverage(stats);

        Assertions.assertEquals(expectedAmountUnderAverage, actualAmountUnderAverage);
    }

    @Test

    public void countAmountMonthAboveAverage() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmountAboveAverage = 5;
        int actualAmountAboveAverage = service.AmountMonthAboveAverage(stats);

        Assertions.assertEquals(expectedAmountAboveAverage, actualAmountAboveAverage);
    }
}
