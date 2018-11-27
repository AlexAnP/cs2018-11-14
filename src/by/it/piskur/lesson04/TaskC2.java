package by.it.piskur.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int i;
        if ((d < 1 | d > 31) | (m < 1 | m > 13)) {
            System.out.println("0");
        } else if (m == 1) {
            i = 0;
            System.out.println(i + d);
        } else if (m == 2 & d<29) {
            i = 31;
            System.out.println(i + d);
        } else if (m == 3) {
            i = 59;
            System.out.println(i + d);
        } else if (m == 4 & d<31) {
            i = 90;
            System.out.println(i + d);
        } else if (m == 5) {
            i = 120;
            System.out.println(i + d);
        } else if (m == 6 & d<31) {
            i = 151;
            System.out.println(i + d);
        } else if (m == 7) {
            i = 181;
            System.out.println(i + d);
        } else if (m == 8) {
            i = 212;
            System.out.println(i + d);
        } else if (m == 9 & d<31) {
            i = 243;
            System.out.println(i + d);
        } else if (m == 10) {
            i = 273;
            System.out.println(i + d);
        } else if (m == 11 & d<31) {
            i = 304;
            System.out.println(i + d);
        } else if (m == 12) {
            i = 334;
            System.out.println(i + d);
        }
        else System.out.println("0");
    }

}
