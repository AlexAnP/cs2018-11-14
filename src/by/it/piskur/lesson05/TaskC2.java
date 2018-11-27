package by.it.piskur.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n*n).
*/

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[20];
        for (int i = 0; i <=19; i++) {
            array[i] = sc.nextInt();
        }

        sort(array);
        for (Integer element : array)
            System.out.println(element);
    }

    public static void sort(int[] array) {
        int i, b, t;
        int size = 20;
        for (i = 1; i < size; i++) {
            for (b=size-1; b>=i; b--) {
                if (array [b-1] < array [b]){
                    t = array [b-1];
                    array [b-1] = array [b];
                    array [b] = t;
                }
            }

        }
    }
}
