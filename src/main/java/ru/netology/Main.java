package ru.netology;

import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService stats = new StatsService();

        System.out.printf("Сумма продаж: " + stats.salesSummary(sales) + "\n");
        System.out.printf("Средняя сумма продаж: " + stats.salesAverage(sales) + "\n");
        System.out.printf("Номер месяца с минимумом продаж: " + stats.salesMinMonth(sales) + "\n");
        System.out.printf("Номер месяца с максимумом продаж: " + stats.salesMaxMonth(sales) + "\n");
        System.out.printf("Количество месяцев с продажами ниже среднего: " + stats.monthBelowAverage(sales) + "\n");
        System.out.printf("Количество месяцев с продажами выше среднего: " + stats.monthAboveAverage(sales) + "\n");
    }
}
