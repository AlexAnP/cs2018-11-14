package by.it.piskur.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        int i;
        ArrayList<Integer> numbers = new ArrayList<>(20);
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 20; i++) {
            int a = sc.nextInt();
            numbers.add(a);
        }
        ArrayList<Integer> num3 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        ArrayList<Integer> numRest = new ArrayList<>();
        for (Integer x : numbers) {
            if (x % 3 == 0)
                num3.add(x);
            if (x% 2 == 0)
                num2.add(x);
            if (x % 3 != 0 && x % 2 != 0)
                numRest.add(x);
        }
        ArrayList <Integer> list = new ArrayList <>();
        list.addAll (num3);
        list.addAll (num2);
        list.addAll (numRest);
        printList (list);
    }

        private static void printList(List<Integer> list) {

            for (Integer aList : list) System.out.println(aList);



        }
    }
