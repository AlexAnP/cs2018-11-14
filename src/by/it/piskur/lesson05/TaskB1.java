package by.it.piskur.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String a = new String("Строка 1");
        String b = new String("Строка 2");
        String c = new String("Строка 3");
        String d = new String("Строка 4");
        String e = new String("Строка 5");
        list.add(a); list.add(b); list.add(c); list.add(d); list.add(e);
        int s = list.size();
        System.out.println(s);
        for (int i=0; i<s; i++)
            System.out.println(list.get(i));

    }

}
