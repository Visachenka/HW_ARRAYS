package ru.netology.stats;
public class StatsService {
    public int salesSummary(long[] sales) {
        long sum = 0;
        for (int i=0; i<sales.length; i++) {
            sum += sales[i];
        }
        return (int) sum;
    }

    public int salesAverage(long[] sales) {
        int sum = salesSummary(sales);
        return  sum / sales.length;
    }

    public  int salesMinMonth(long[] sales) {
        int minMonth = 0;
        for (int i=0; i<sales.length; i++) {
            if(sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public  int salesMaxMonth(long[] sales) {
        int maxMonth = 0;
        for (int i=0; i<sales.length; i++) {
            if(sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int monthBelowAverage(long[] sales) {
        int average = salesAverage(sales);
        int monthCount = 0;
        for (int i=0; i<sales.length; i++) {
            if (sales[i] < average)
                monthCount += 1;
        }
        return monthCount;
    }

    public int monthAboveAverage(long[] sales) {
        int average = salesAverage(sales);
        int monthCount = 0;
        for (int i=0; i<sales.length; i++) {
            if (sales[i] > average)
                monthCount += 1;
        }
        return monthCount;
    }
}
