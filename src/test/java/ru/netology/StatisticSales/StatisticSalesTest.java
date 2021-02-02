package ru.netology.StatisticSales;

import jdk.dynalink.beans.StaticClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticSalesTest {
    @Test
    void calculateSum() {
        StatisticSales service = new StatisticSales();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;

        int sum = service.calculateSum(purchases);

        assertEquals(sum, expected);
    }

    @Test
    void avgSales() {
        StatisticSales service = new StatisticSales();
        int expected = 15;
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int averageSales = service.calculateAvgSales(purchases);
        assertEquals(expected, averageSales);
    }

    @Test
    void MonthMinSum() {
        StatisticSales service = new StatisticSales();
        int expected = 8;
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int currentMax = service.MonthMinSum(purchases);
        assertEquals(expected, currentMax);

    }

    @Test
    void MonthMaxSum() {
        StatisticSales service = new StatisticSales();
        int expected = 9;
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int currentMax = service.MonthMaxSum(purchases);
        assertEquals(expected, currentMax);

    }

    @Test
    void mothsUnderAvg() {
        StatisticSales service = new StatisticSales();
        int expected = 5;
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int monthsOverAvg = service.calculateMonthsUnderAvg(purchases);
        assertEquals(expected, monthsOverAvg);
    }

    @Test
    void mothsOverAvg() {
        StatisticSales service = new StatisticSales();
        int expected = 5;
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int monthsOverAvg = service.calculateMonthsUnderAvg(purchases);
        assertEquals(expected, monthsOverAvg);
    }

}


