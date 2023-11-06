package ru.otus.java;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class HomeWorkJava3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Это домашнее задание для урока 5. Список доступных команд:");
        System.out.println("1 - sumOfPositiveElements. Сумма элементов больше нуля");
        System.out.println("2 - kvdt. Вывести квадрат со стороной а");
        System.out.println("3 - diagMass. Занулить диагональ");
        System.out.println("4 - findMax. Максимальный элемент");
        System.out.println("5 - metod5. Сумма второй строки");
        System.out.println();
        System.out.println("Введите номер комманды:");
        int me = scanner.nextInt();
        scanner.nextLine();

        if (me == 1) {
            System.out.println("Выбран метод sumOfPositiveElements.");
            int[][] arr = new int[3][3];
            System.out.println("Исходный массив: ");
            for (int j=0; j < 3; j++) {
                for (int i=0; i < 3; i++) {
                    arr[j][i] = (int) ((Math.random() - Math.random()) * 10);
                }
                System.out.println(Arrays.toString(arr[j]));
            }
            sumOfPositiveElements(arr);
        }

        if (me == 2) {
            System.out.println("Выбран метод kvdt.");
            System.out.println("Введите длину стороны:");
            int a = scanner.nextInt();
            scanner.nextLine();
            kvdt(a);
        }

        if (me == 3) {
            System.out.println("Выбран метод diagMass.");
            int[][] arr = new int[3][3];
            System.out.println("Исходный массив: ");
            for (int j=0; j < 3; j++) {
                for (int i=0; i < 3; i++) {
                    arr[j][i] = (int) ((Math.random() - Math.random()) * 10);
                }
                System.out.println(Arrays.toString(arr[j]));
            }
            diagMass(arr);
        }

        if (me == 4) {
            System.out.println("Выбран метод findMax.");
            int[][] arr = new int[3][3];
            System.out.println("Исходный массив: ");
            for (int j=0; j < 3; j++) {
                for (int i=0; i < 3; i++) {
                    arr[j][i] = (int) ((Math.random() - Math.random()) * 10);
                }
                System.out.println(Arrays.toString(arr[j]));
            }
            findMax(arr);
        }

        if (me == 5) {
            System.out.println("Выбран метод metod5.");
            int e = 1;
            int[][] arr = new int[e][e];
            System.out.println("Исходный массив: ");
            for (int j=0; j < e; j++) {
                for (int i=0; i < e; i++) {
                    arr[j][i] = (int) ((Math.random() - Math.random()) * 10);
                }
                System.out.println(Arrays.toString(arr[j]));
            }
            metod5(arr, e);
        }
    }

    public static void sumOfPositiveElements(int[][] arr) {
        int x = 0;
        for (int j=0; j < 3; j++) {
            for (int i=0; i < 3; i++) {
               if (arr[j][i] > 0) {
                   x = x + arr[j][i];
            }
        }

        }
        System.out.println("Сумма элементов, больших чем 0: " + x);
    }

    public static void kvdt(int a) {
        for (int j=0; j < a; j++) {
            for (int i=0; i < a; i++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }

    public static void diagMass(int[][] arr) {
        for (int j=0; j < 3; j++) {
            arr[j][j] = 0;
            }

        System.out.println("Исходный массив: ");
        for (int j=0; j < 3; j++) {
            System.out.println(Arrays.toString(arr[j]));
        }
        }

    public static void findMax(int[][] arr) {
        int x = 0;
        for (int j=0; j < 3; j++) {
            for (int i=0; i < 3; i++) {
                if (arr[j][i] > x) {
                    x = arr[j][i];
                }
            }

        }
        System.out.println("Максимальный элемент: " + x);
    }

    public static void metod5(int[][] arr, int e) {
        if (e < 2) {
        System.exit(-1);
        }
        int x = 0;
        for (int j=0; j < e; j++) {
            for (int i=0; i < e; i++) {
                if (j == 1) {
                    x = x + arr[j][i];
                }
            }

        }
        System.out.println("Сумма: " + x);
    }
}