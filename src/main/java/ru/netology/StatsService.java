package ru.netology;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int averageValue(int[] sales) {
        return calculateSum(sales) / sales.length;
    }


    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int monthBelowAverage(int[] sales) {
        int quantityMonth = 0;
        int midSum = calculateSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale < midSum) {
                quantityMonth = quantityMonth + 1;
            }
        }
        return quantityMonth;
    }


    public int monthAboveAverage(int[] sales) {
        int quantityMonth = 0;
        int midSum = calculateSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale > midSum) {
                quantityMonth = quantityMonth + 1;
            }
        }
        return quantityMonth;
    }
}
