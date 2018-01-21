package com.epam;

import com.epam.generics.MainGeneric;
import com.epam.lesson1.Lesson1;
import com.epam.trains.Lesson2;
import com.epam.strings.Lesson5Main;
import com.epam.generics.Generics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Lesson5Main lesson3Main;
//        lesson3Main = new Lesson5Main();
//        lesson3Main.run();

        lessonChooser();
    }

    private static void lessonChooser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lesson 1, Lesson 2. Lesson 3. Lesson 4. \nEnter chosen option: ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                Lesson1 lessonTask1 = new Lesson1();
                lessonTask1.run();
                break;
            case 2:
                Lesson2 lessonTask2 = new Lesson2();
                lessonTask2.run();
                break;
            case 3:
                Lesson5Main lesson5Main = new Lesson5Main();
                lesson5Main.run();
                break;
            case 4:
                MainGeneric generic = new MainGeneric();
                generic.run();
                break;
            default:
                System.out.println("Error: Wrong value");
                lessonChooser();
                break;
        }
    }
}
