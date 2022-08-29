package com.company.task1;

public class Test {

    public static void main(String[] args) throws Exception {
        test1();
        test2();
        test3();
        test4();
        System.out.println("Тесты успешно пройдены");
    }

    /**
     * Проверка на длину массива
     */
    public static void test1() {
        double[][] array = com.company.task1.Main.createDoubleMas(100);
        assert array.length == 100 : "Длина массива не соответствует заданной";
    }

    /**
     * Проверка на минимальное значение
     */
    public static void test2() throws Exception {
        double[][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        assert com.company.task1.Main.getMinValue(array) == 1 : "Не верное минимальное значение";
    }

    /**
     * Проверка на максимальное значение
     */
    public static void test3() throws Exception {
        double[][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        assert com.company.task1.Main.getMaxValue(array) == 16 : "Не верное максимальное значение";
    }

    /**
     * Проверка на среднее значение
     */
    public static void test4() throws Exception {
        double[][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        assert com.company.task1.Main.getAvgValue(array) == 8.5625 : "Не верное среднее значение";
    }
}
