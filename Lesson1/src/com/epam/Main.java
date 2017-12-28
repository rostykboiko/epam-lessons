package com.epam;

import com.epam.lesson1.Lesson1;
import com.epam.lesson2.Lesson2;

public class Main {
    private static Lesson1 lessonTask1;
    private static Lesson2 lessonTask2;
    public static void main(String[] args) {
        lessonTask1 = new Lesson1();
       //  lessonTask1.task();

        lessonTask2= new Lesson2();
        lessonTask2.run();
    }


}
