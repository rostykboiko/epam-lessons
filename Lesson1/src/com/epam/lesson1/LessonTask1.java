package com.epam.lesson1;

import java.util.Scanner;

public class LessonTask1 {
    private int[] f = new int[25];
    private int[] array = new int[5];
    private Scanner scanner = new Scanner(System.in);

    public void task() {
        System.out.print("Fibonacci 1, Sort 2. \nMake a choice: ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                fibonacci();
                printArray(f);
                break;
            case 2:
                initArray();
                sort();
                break;
        }
    }

    private void fibonacci() {
        f[0] = 1;
        f[1] = 1;

        for (int i = 2; i < f.length; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
    }

    private void initArray() {
        for (int i = 0; i < 5; ) {
            System.out.println("Enter num");

            int scannedNum = scanner.nextInt();
            if (scannedNum == 0) {
                array = new int[]{12345, 45464, 33333, 79854, 78975};
                i = 5;
                System.out.println("Default array!");

            } else if (scannedNum > 9999) {
                array[i] = scannedNum;
                i++;
            } else {
                System.out.println("You have to enter number with 5 or more characters!");
            }
        }
    }

    private void sort() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        printArray(array);
    }

    private void printArray(int[] array) {
        if (array != null) {
            System.out.print(" Sorted num ");
            for (int aSortedNum : array) {
                System.out.print(" " + aSortedNum);
            }
        }
    }
}