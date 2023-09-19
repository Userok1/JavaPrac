package com.mycompany.javaprac;
import java.util.Scanner;

public class Practica2 {

    public static void main(String[] args) {
        int [] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        arr[0] = scanner.nextInt();
        int total = arr[0], min = arr[0], max = 0;
        for (int i = 1; i < 10; i++) {
            arr[i] = scanner.nextInt();
            total += arr[i];
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Сумма числе в массиве: " + total);
        System.out.println("Максимальное число в массиве: " + max);
        System.out.println("Минимальное число в массиве: " + min);
    }   
    
}
