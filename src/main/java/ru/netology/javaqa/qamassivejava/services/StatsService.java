package ru.netology.javaqa.qamassivejava.services;
public class StatsService {
    public int amountAllSales(int[] stats) {
        int amount = 0;
        for (int i = 0; i < stats.length; i++) {
            amount = amount + stats[i];
        }
        return amount;
    }

    public int averageAmount(int[] stats) {
        int average = amountAllSales(stats);
        return average / 12;
    }

    public int maxSales(int[] stats) {
        int max = 0;
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] > stats[max]) {
                max = i;
            }
        }
        return max+1;
    }

    public int minSales(int[] stats) {
        int min = 0;
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] < stats[min]) {
                min = i;
            }
        }
        return min+1;
    }

    public int amountMonthUnderAverage(int[] stats) {
        int underAverage = 0;
        int average = averageAmount(stats);
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] < average) {
                underAverage++;
            }
        }
        return underAverage;
    }

    public int amountMonthAboveAverage(int[] stats) {
        int aboveAverage = 0;
        int average = averageAmount(stats);
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] > average) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }
}
