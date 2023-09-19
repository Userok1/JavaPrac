package com.mycompany.javaprac;


public class JavaPrac {

    public static void main(String[] args) {
        int [] arr = new int[] {1, 2, 3, 4, 5};
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += arr[i];
        }
        System.out.println("Сумма элементов массива: " + total);
        System.out.print("Среднее арифметическое элементов массива: " + total / 5);
    }
}
