package com.epam.strings;

import java.util.*;

//    1. Текст, вводится через консоль, два однакові символи які йдуть підряд замінити одним
//    2. Текст, відформатувати по правому краю
//    3. Барровз Віллер,
//    a) зміщення по одній букві
//    I - java
//    II - avaj
//    III - vaja
//    IV - ajav
//    b) сортування
//    c) останні букви

public class Lesson5Main {
    private Scanner scanner = new Scanner(System.in);
    private int lengthOfLine = 50;
    private int duplicatesCounter = 0;

    public void run() {
        System.out.print("Task 1, Task 2. Task 3. \nEnter chosen option: ");
        int index = scanner.nextInt();
        switch (index) {
            case 1:
                String formattedString;
                System.out.print("Enter Text for the task1: ");
                formattedString = task1(getText());
                printString(formattedString);
                System.out.println("Duplicates found: " + duplicatesCounter);
                break;
            case 2:
                System.out.print("Enter Text for the task1: \n");
                formattedString = task2(getText());
                printString(formattedString);
                break;
            case 3:
                System.out.println("Final result: " + task3());
                break;
            default:
                System.out.println("Error: Wrong value");
                run();
                break;
        }
    }

    private String getText() {
        StringBuilder str = new StringBuilder();
        while (scanner.hasNextLine()) {
            str.append(scanner.nextLine());
        }
        return str.toString();
    }

    private String task1(String stringToCorrect) {
        duplicatesCounter = 0;
        StringBuilder formattedString = new StringBuilder();
        int index = 0;
        char[] chars = stringToCorrect.toCharArray();

        for (char c : chars) {
            if (index + 1 < chars.length && c != chars[index + 1]) {
                formattedString.append(c);
            } else if (index == chars.length - 1) {
                formattedString.append(c);
            } else {
                duplicatesCounter++;
            }
            index++;
        }
        return formattedString.toString();
    }

    private String task2(String stringToFormat) {
        StringBuilder formattedString = new StringBuilder();
        int lengthOfCurrentLine = 0;
        String[] parts = stringToFormat.split(" ");
        System.out.println("Слів: " + (parts.length - 1));
        for (String word : parts) {
            lengthOfCurrentLine += word.length();
            if (lengthOfCurrentLine < lengthOfLine) {
                formattedString.append(word);
                formattedString.append(" ");
            } else {
                formattedString.append(word);
                formattedString.append("\n");
                lengthOfCurrentLine = 0;
            }
        }
        return formattedString.toString();
    }

    private String task3() {
        String inputtedString;
        System.out.println("Enter the word: ");
        inputtedString = scanner.next();

        char[][] bwtWord = getRotations(inputtedString);
        String[] bwtString = charToString(bwtWord);

        System.out.println("All rotations: ");
        printArrayOfString(bwtString);
        bwtString = sort(bwtString);
        System.out.println("Sorted rotations: ");
        printArrayOfString(bwtString);
        inputtedString = lastIteration(bwtString);
        return inputtedString;
    }

    private char[][] getRotations(String bwtWord) {
        int lengthOfWord = bwtWord.length();
        char[][] allRotations = new char[lengthOfWord][lengthOfWord];
        char[] bwtChars = bwtWord.toCharArray();

        for (int i = 0; i < lengthOfWord; i++) {
            System.arraycopy(bwtChars, 1, allRotations[i], 0, lengthOfWord - 1);
            allRotations[i][lengthOfWord - 1] = bwtChars[0];
            bwtChars = allRotations[i];
        }

        return allRotations;
    }

    private String[] sort(String[] arrayOfStings) {
        int length = arrayOfStings.length;
        String temp;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arrayOfStings[i].compareTo(arrayOfStings[j]) > 0) {
                    temp = arrayOfStings[i];
                    arrayOfStings[i] = arrayOfStings[j];
                    arrayOfStings[j] = temp;
                }
            }
        }
        return arrayOfStings;
    }

    private String lastIteration(String[] sortedRotations) {
        StringBuilder outPut = new StringBuilder();
        for (String word : sortedRotations) {
            outPut.append(word.substring(word.length() - 1));
        }
        return outPut.toString();
    }

    private String[] charToString(char[][] allRotations) {
        int length = allRotations.length;
        String[] arrayOfStrings = new String[length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == 0) {
                    arrayOfStrings[i] = allRotations[i][j] + "";
                } else {
                    arrayOfStrings[i] += allRotations[i][j];
                }
            }
        }

        return arrayOfStrings;
    }

    private void printString(String outPutText) {
        System.out.println(outPutText);
    }

    private void printArrayOfString(String[] outPutText) {
        for (String word : outPutText)
            System.out.println(word);
    }

    private void printArrayOfChar(char[][] rotations) {
        for (char[] rotation : rotations) {
            for (int j = 0; j < rotations.length; j++) {
                System.out.print(rotation[j] + " ");
            }
            System.out.print("\n");
        }
    }

    private void printArrayOfChar(char[] rotations) {
        for (char rotation : rotations) {
            System.out.print(rotation + " ");
        }
    }
}
