package ru.netology.stats;

public class StatsService {
    // сумма всех продаж
    public int totalSum(int[] sales) {
        int sum = 0;
        for (int monthSale : sales) {
            sum += monthSale;
        }
        return sum;
    }

    // средняя сумма продаж в месяц
    public int averageMonthlySales(int[] sales) {
        int averageSale = totalSum(sales) / sales.length;
        return averageSale;
    }

    //номер месяца, в котором был пик продаж
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

    //номер месяца, в котором был минимум продаж
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

    //количество мес, в которых продажи ниже среднего
    public int monthsAmountSalesBelowAverage(int[] sales) {
        int monthsAmount = 0;

        for (int monthSale : sales) {
            if (monthSale < averageMonthlySales(sales)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;
    }

    //количество мес, в которых продажи выше среднего
    public int monthsAmountSalesAboveAverage(int[] sales) {
        int monthsAmount = 0;

        for (int monthSale : sales) {
            if (monthSale > averageMonthlySales(sales)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;

    }
}