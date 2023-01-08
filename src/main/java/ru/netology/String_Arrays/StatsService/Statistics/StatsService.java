package ru.netology.String_Arrays.StatsService.Statistics;

public class StatsService {
    int counter = 0;
    int minimumMoth = 0;
    int maximumMonth = 0;

    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;
        }
        return result;
    }

    public long average(long[] sales) {
        long result = sum(sales);
        return result / sales.length;

    }

    public int peakSales(long[] sales) {
        long maximumSale = sales[maximumMonth];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximumSale) {
                maximumMonth = i;
                maximumSale = sales[i];
            }
        }
        return maximumMonth + 1;
    }

    public int miniSales(long[] sales) {
        long minimumSale = sales[minimumMoth];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minimumSale) {
                minimumMoth = i;
                minimumSale = sales[i];
            }
        }
        return minimumMoth + 1;
    }

    public int belowAverage(long[] sales) {
        long averageAmount = average(sales);
        for (long sale : sales) {
            if (sale < averageAmount) {
                counter++;

            }
        }
        return counter;
    }

    public int aboveAverage(long[] sales) {
        long averageAmount = average(sales);
        for (long sale : sales) {
            if (sale > averageAmount) {
                counter++;
            }
        }
        return counter;
    }
}

