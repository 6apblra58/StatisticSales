package ru.netology.StatisticSales;

public class StatisticSales {
    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public int calculateAvgSales(int[] purchases) {
        int avgSales = calculateSum(purchases) / purchases.length;

        return avgSales;
    }

    public int MonthMinSum(int[] purchases) {
        int currentMin = purchases[0];
        int month = 0;
        int minMonth = 0;

        for (int purchase : purchases) {

            month += 1;
            if (currentMin <= purchase) {
                currentMin = purchase;
                minMonth = month;

            }
        }

        return minMonth;
    }

    public int MonthMaxSum(int[] purchases) {
        int currentMin = purchases[0];
        int month = 0;
        int minMonth = 0;

        for (int purchase : purchases) {

            month += 1;
            if (currentMin >= purchase) {
                currentMin = purchase;
                minMonth = month;

            }
        }

        return minMonth;
    }

    public int calculateMonthsUnderAvg(int[] purchases) {
        int monthUnderAvg = 0;
        int avgSales = calculateSum(purchases) / purchases.length;
        for (int purchase : purchases) {
            if (purchase < avgSales)
                monthUnderAvg += 1;
        }
        return monthUnderAvg;
    }

    public int calculateMonthsOverAvg(int[] purchases) {
        int monthOverAvg = 0;
        int avgSales = calculateSum(purchases) / purchases.length;
        for (int purchase : purchases) {
            if (purchase > avgSales)
                monthOverAvg += 1;
        }
        return monthOverAvg;
    }
}


