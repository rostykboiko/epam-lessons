package com.epam.lesson1;

import java.util.Scanner;

public class Lesson1 {
    private int[] f = new int[25];

    private Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.print(
                "Fibonacci 1, " +
                        "Sort 2, " +
                        "Increase 3, " +
                        "Simple numbers 4. " + "\n" +
                        "Enter chosen option: ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                fibonacci();
                printArray("Fibonacci numbers: ", f);
                break;
            case 2:
                int[] array = initArray();
                sort(array);
                printArray("Sorted num: ", array);
                break;
            case 3:
                array = initArray();
                printIncreasingNumbers(array);
                break;
            case 4:
                array = initArray();
                containPrimeNumCheck(array);
                break;
            case 5:
                array = initArray();
                printArray("", getPrime(array));
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

    private int[] initArray() {
        int[] array = new int[5];
        for (int i = 0; i < 5; ) {
            System.out.println("Enter num");

            int scannedNum = scanner.nextInt();
            if (scannedNum == 0) {
                array = new int[]{12345, 45464, 99991, 45678, 78975};
                i = 5;
                printArray("Default array!", array);

            } else if (scannedNum > 9999) {
                array[i] = scannedNum;
                i++;
            } else {
                System.out.println("You have to enter number with 5 or more characters!");
            }
        }
        return array;
    }

    private void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private void printArray(String message, int[] array) {
        if (array != null) {
            System.out.print(message);
            for (int aSortedNum : array) {
                System.out.print(" " + aSortedNum);
            }
        }
    }

    private void printIncreasingNumbers(int[] array) {
        int currentNum;
        boolean increasing;
        int[] numArray = new int[5];

        for (int anArray : array) {
            increasing = true;
            currentNum = anArray;
            for (int j = 0; j < 5; j++) {
                numArray[j] = currentNum / (int) (Math.pow(10, array.length - 1 - j));
                currentNum = anArray % (int) (Math.pow(10, array.length - 1 - j));
                if (j != 0) {
                    if ((numArray[j - 1] + 1) != numArray[j]) {
                        increasing = false;
                        j = 5;
                    }
                }
            }
            if (increasing) {
                System.out.println(" " + anArray);
            }
        }
    }

    public int[] getPrimeNumbers(int[] primeNumbers, int min, int max) {
        int j = 0;
        for (int i = min; i <= max; i++) {
            int counter = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers[j] = i;
                j++;
            }
        }
        return primeNumbers;
    }

    private void containPrimeNumCheck(int[] array) {
        int currentNum;
        int[] primeNumbers = new int[4];
        primeNumbers = getPrimeNumbers(primeNumbers, 1, 10);
        boolean containPrime;
        int[] numArray = new int[5];
        printArray("\nPrime numbers: ", primeNumbers);
        System.out.println("\nNumbers that contain prime Num: ");

        for (int anArray : array) {
            containPrime = false;
            currentNum = anArray;
            for (int j = 0; j < 4; j++) {
                numArray[j] = currentNum / (int) (Math.pow(10, array.length - 1 - j));
                currentNum = anArray % (int) (Math.pow(10, array.length - 1 - j));
                for (int prime : primeNumbers) {
                    if (numArray[j] == prime) {
                        containPrime = true;
                        j = 4;
                    }
                }
            }
            if (containPrime) {
                System.out.print(anArray + " ");
            }
        }
    }

    public int[] getPrime(int[] array) {
        int[] prime = new int[8363];
        System.out.println("\nPlease, " +
                "Stand by.");
        prime = getPrimeNumbers(prime, 9999, 100000);

        for (int primeNum : prime) {
            for (int num : array) {
                if (primeNum == num) System.out.println(num + " ");
            }
        }
        return prime;
    }
}