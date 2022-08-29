package com.company.task1;

/**
 * Заполняется двумерный массив случайным числами и выводится максимальное, минимальное и среднее значение.
 *
 * @author Алексей Жуков
 * @version 1
 */
public class Main {

    /**
     * Длина массива
     */
    private static final int LENGTH_MAS = 100;

    public static void main(String[] args) throws Exception {

        // Создаем массив
        double[][] masNumber = createDoubleMas(LENGTH_MAS);

        // Выводим результаты
        System.out.println("Минимальное значение массива = " + getMinValue(masNumber));
        System.out.println("Максимальное значение массива = " + getMaxValue(masNumber));
        System.out.println("Среднее значение массива = " + getAvgValue(masNumber));
    }


    /**
     * Создание массива
     *
     * @param length длина массива
     * @return двумерный массив со случайными числами
     */
    public static double[][] createDoubleMas(int length) {
        double[][] mas = new double[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                mas[i][j] = Math.random() * 100;
            }
        }
        return mas;
    }

    /**
     * Вывод минимального значения
     *
     * @param mas массив с числами
     * @return минимальное значение
     */
    public static double getMaxValue(double[][] mas) throws Exception {
        if (mas == null) throw new Exception("Некорректный массив");

        double max = mas[0][0];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (max < mas[i][j]) max = mas[i][j];
            }
        }

        return max;
    }

    /**
     * Вывод максимального значения
     *
     * @param mas массив с числами
     * @return максимальное значение
     */
    public static double getMinValue(double[][] mas) throws Exception {
        if (mas == null) throw new Exception("Некорректный массив");

        double min = mas[0][0];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (min > mas[i][j]) min = mas[i][j];
            }
        }

        return min;
    }

    /**
     * Вывод среднего значения
     *
     * @param mas массив с числами
     * @return среднее значение
     */
    public static double getAvgValue(double[][] mas) throws Exception {
        if (mas == null) throw new Exception("Некорректный массив");

        double avg = mas[0][0];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                avg += mas[i][i];
            }
        }
        avg = avg / (mas.length * mas.length);

        return avg;
    }
}
