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
        int max = max(sales);
        int monthCounter = 0;
        int maxMonthNumber = 0;
        for (int sale : sales) {
            monthCounter++;
            if (sale == max) {
                maxMonthNumber = monthCounter;
            }
                    }
        return maxMonthNumber ;
    }

    private int max(int[] sales) {
        int max = sales[0];
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    //номер месяца, в котором был минимум продаж
    public int minSales(int[] sales) {
        int min = min(sales);
        int monthCounter = 0;
        int minMonthNumber = 0;
        for (int sale : sales) {
            monthCounter++;
            if (sale == min) {
                minMonthNumber = monthCounter;
            }
        }
        return minMonthNumber ;
    }

    private int min(int[] sales) {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    //количество мес, в которых продажи ниже среднего
    public int monthsAmountSalesBelowAverage(int[] sales) {
        int monthsAmount = 0;
        int averageMonthlySales = averageMonthlySales(sales);
        for (int monthSale : sales) {
            if (monthSale < averageMonthlySales) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;
    }

    //количество мес, в которых продажи выше среднего
    public int monthsAmountSalesAboveAverage(int[] sales) {
        int monthsAmount = 0;
        int averageMonthlySales = averageMonthlySales(sales);
        for (int monthSale : sales) {
            if (monthSale > averageMonthlySales) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;
    }
}
