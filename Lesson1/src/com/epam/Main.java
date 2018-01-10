package com.epam;

import com.epam.lesson1.Lesson1;
import com.epam.lesson2.Lesson2;
import com.epam.lesson3.Lesson5Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        lessonChooser();
    }

    private static void lessonChooser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lesson 1, Lesson 2. Lesson 3. \nEnter chosen option: ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                Lesson1 lessonTask1;
                lessonTask1 = new Lesson1();
                lessonTask1.run();
                break;
            case 2:
                Lesson2 lessonTask2;
                lessonTask2 = new Lesson2();
                lessonTask2.run();
                break;
            case 3:
                Lesson5Main lesson3Main;
                lesson3Main = new Lesson5Main();
                lesson3Main.run();
                break;
        }

    }


}
