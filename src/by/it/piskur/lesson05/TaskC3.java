package by.it.piskur.lesson05;

/* Задачка на сортировку2
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n log n)
*/


import java.util.Scanner;

public class TaskC3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[20];
        for (int i = 0; i <= 19; i++) {
            array[i] = sc.nextInt();
        }
        int low = 0;
        int high = array.length - 1;
        sort(array, low, high);
        for (int i = array.length - 1; i >= 0; i--)
            System.out.println(array[i]);
    }

    public static void sort(int[] array, int low, int high) {
        if (low >= high) return;
        int m, p;
        m = low + (high - low) / 2;
        p = array[m];
        int l = low;
        int h = high;
        while (l <= h) {
            while (array[l] < p) {
                l++;
            }
            while (array[h] > p) {
                h--;
            }
            if (l <= h) {
                int temp = array[l];
                array[l] = array[h];
                array[h] = temp;
                l++;
                h--;
            }

        }
        if (low < h)
            sort(array, low, h);
        if (high > l)
            sort(array, l, high);

    }

}

