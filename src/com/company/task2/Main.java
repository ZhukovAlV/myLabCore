package com.company.task2;

/**
 * Отсортируйте массив [5,6,3,2,5,1,4,9]
 *
 * @author Алексей Жуков
 * @version 1
 */
public class Main {

    public static void main(String[] args) throws Exception {
        int[] array = {5, 6, 3, 2, 5, 1, 4, 9, 7, 3, 5};

        System.out.println("Выводим массив до сортировки");
        printMas(array);

        System.out.println("Выводим массив после сортировки");
        shellSort(array);
        printMas(array);
    }

    /**
     * Сортировка массива методом Шелла
     *
     * @param array массив
     */
    public static void shellSort(int[] array) throws Exception {
        if (array == null || array.length == 0) throw new Exception("Некорректный массив");

        int gap = array.length / 2;
        // Пока разница между элементами есть
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                // Смещаем правый указатель, пока не сможем найти такой, что
                // между ним и элементом до него не будет нужного промежутка
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                        swap(array, c, c + gap);
                    }
                }
            }
            // Пересчитываем разрыв
            gap = gap / 2;
        }
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    /**
     * Вывод массива в консоль
     * @param mas массив чисел
     */
    public static void printMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            if (i == mas.length - 1) System.out.println(mas[i] + "");
            else System.out.print(mas[i] + " ");
        }
    }
}
