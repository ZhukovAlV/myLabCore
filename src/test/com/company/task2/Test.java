package com.company.task2;

public class Test {

    public static void main(String[] args) throws Exception {
        test1();
        System.out.println("Тест успешно пройден");
    }

    public static void test1() throws Exception {
        int[] array = {5, 6, 3, 2, 5, 1, 4, 9, 7, 3, 5};
        com.company.task2.Main.shellSort(array);
        assert array[0] == 1 : "Не верно упорядочен массив, начальное значение некорректно";
        assert array[10] == 9 : "Не верно упорядочен массив, конечное значение некорректно";
    }
}
