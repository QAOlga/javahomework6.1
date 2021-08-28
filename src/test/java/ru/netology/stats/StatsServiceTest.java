package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {
    // сумма всех продаж
    @Test
    void findTotalSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.totalSum(sales);

        assertEquals(expected, actual);
    }

    // средняя сумма продаж в месяц
    @Test
    void findAverageMonthlySales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.averageMonthlySales(sales);

        assertEquals(expected, actual);

    }

    //номер месяца, в котором был пик продаж
    @Test
    void findMaximumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    // номер месяца, в котором был минимум продаж
    @Test
    void findMinimumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    //количество мес, в которых продажи ниже среднего
    @Test
    void findMonthsAmountSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthsAmountSalesBelowAverage(sales);

        assertEquals(expected, actual);
    }

    //количество мес, в которых продажи выше среднего
    @Test
    void findMonthsAmountSalesAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthsAmountSalesAboveAverage(sales);

        assertEquals(expected, actual);
    }
}


