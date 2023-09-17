package ru.netology.javaqa.qamassivejava.services;
public class StatsService {
    public int AmountAllSales(int[] stats) {
        int amount = 0;
        for (int i = 0; i < stats.length; i++) {
            amount = amount + stats[i];
        }
        return amount;
    }

    public int AverageAmount(int[] stats) {
        int average = AmountAllSales(stats);
        return average / 12;
    }

    public int MaxSales(int[] stats) {
        int max = 0;
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] > stats[max]) {
                max = i;
            }
        }
        return max+1;
    }

    public int MinSales(int[] stats) {
        int min = 0;
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] < stats[min]) {
                min = i;
            }
        }
        return min+1;
    }

    public int AmountMonthUnderAverage(int[] stats) {
        int underAverage = 0;
        int average = AverageAmount(stats);
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] < average) {
                underAverage++;
            }
        }
        return underAverage;
    }

    public int AmountMonthAboveAverage(int[] stats) {
        int aboveAverage = 0;
        int average = AverageAmount(stats);
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] > average) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }
}
