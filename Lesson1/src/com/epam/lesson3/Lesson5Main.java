package com.epam.lesson3;

//    1. Текст, вводится через консоль, два однакові символи які йдуть підряд замінити одним
//    2. Текст, відформатувати по правому краю
//    3. Барровз Віллер, a) зміщення по одній букві
//    I - java
//    II - avaj
//    III - vaja
//    IV - ajav
//    V - java
//    b) сортування
//    c) останні букви

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Lesson5Main {
    private Scanner scanner = new Scanner(System.in);
    private String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec iaculis imperdiet tellus, dictum congue velit efficitur sit amet. Aliquam erat volutpat. Nam eget rhoncus lorem, eu mattis nisl. Integer erat odio, auctor eu est eu, maximus scelerisque dolor. Donec turpis magna, eleifend ornare tellus vitae, luctus lobortis neque. Nulla congue ut neque eget eleifend. In hac habitasse platea dictumst. Morbi vel elit faucibus, tristique magna euismod, aliquet nunc. Aenean fringilla, felis vel dictum dictum, tortor mi feugiat felis, vitae aliquet ante magna nec dolor. Sed aliquam ex at tellus laoreet, eget commodo urna tempor. Vestibulum eu nulla fermentum, pulvinar ex a, vehicula magna. Aenean molestie leo eget augue convallis facilisis. Quisque sodales ex et ultricies finibus. Phasellus molestie vulputate velit. Curabitur semper nulla et justo posuere ultrices.\n" +
            "Curabitur aliquam nunc nec sapien mattis rhoncus. Sed maximus tortor vel est efficitur, condimentum facilisis nisi pretium. Fusce blandit risus eget lacinia faucibus. Phasellus porta arcu in tellus consectetur volutpat. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras bibendum accumsan tortor, non tincidunt nulla rhoncus ac. Cras eros lorem, rhoncus sit amet bibendum non, lacinia vitae nisi.\n" +
            "Vivamus non suscipit augue, non vehicula neque. Mauris lectus nibh, eleifend sed eros non, commodo viverra eros. Vestibulum et purus eget libero venenatis maximus. Vestibulum volutpat elementum massa sit amet ullamcorper. Integer a sollicitudin risus. Aliquam fringilla eu purus id porttitor. Vivamus non nunc nec risus volutpat finibus. Etiam vitae magna non risus pretium consequat. Quisque iaculis orci quis convallis hendrerit. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Quisque vestibulum elit ac dui maximus viverra. Pellentesque tempus ligula vel arcu suscipit, at mattis libero pharetra. Suspendisse hendrerit ex elit, et ultricies justo commodo commodo. Pellentesque elementum odio dui, vel suscipit turpis hendrerit ut.\n" +
            "Sed mollis ante sit amet velit tempus lobortis. Morbi dolor felis, vulputate et neque ut, pulvinar faucibus magna. Donec suscipit odio vitae lobortis interdum. Etiam consequat at leo condimentum malesuada. Etiam tellus mi, euismod at sem rutrum, volutpat pellentesque est. Integer consectetur elit sit amet ipsum convallis, sed luctus enim euismod. In vel cursus orci. Aliquam finibus diam mi, id semper nibh tempor at. Phasellus tortor justo, commodo eget posuere ut, blandit sed odio. Nunc eu dui in massa hendrerit mattis vel sit amet ipsum. Aliquam erat volutpat. Etiam ut consectetur risus. Duis at fermentum ligula. In faucibus hendrerit arcu, gravida elementum libero dapibus ac.\n" +
            "Donec massa ante, sollicitudin ac fermentum quis, tincidunt consectetur dolor. Pellentesque volutpat convallis velit, facilisis finibus lectus volutpat vitae. Cras sodales ut nunc in volutpat. Suspendisse potenti. Vivamus interdum hendrerit risus vel rutrum. Cras nec massa lobortis, pharetra sem ut, mattis dolor. Nulla egestas vitae tortor a ullamcorper. Donec at lacus purus. Nam lobortis lacus neque, faucibus placerat nunc cursus vitae. Duis orci diam, pretium et volutpat eget, facilisis id lorem. Cras et euismod dolor. Duis dignissim ac magna non tempus.";

    public void run() {
        System.out.print("Task 1, Task 2. Task 3. \nEnter chosen option: ");
        int index = scanner.nextInt();
        switch (index) {
            case 1:
                printString(task1());
                break;
            case 2:
                task2();
                break;
            case 3:
                task3(lorem);
                break;
        }
    }

    private String getText() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String accStr;
        try {
            accStr = br.readLine();
            return accStr;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String task1() {
        System.out.print("Enter Text for the task1: ");
        String outPutString = getText();

        outPutString = removeDuplicates(getText());

        return outPutString;
    }

    private String removeDuplicates(String input) {
        String result;
        result = input;
        for (int i = 0; i < input.length(); i++) {
            if (!result.contains(String.valueOf(input.charAt(i)))) {
                result += String.valueOf(input.charAt(i));
            }
        }
        return result;
    }

    private void task2() {
        String string = "MMMamaj";
        int index = 0;
        char[] chars = string.toCharArray();

        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            if ( index + 1 < chars.length && c != chars[index + 1]){
                charSet.add(c);
            } else {
                charSet.add(c);
            } index++;
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        System.out.println(sb.toString());
    }

    private void task3(String inputString) {
    }

    private void printString(String outPutText) {
        System.out.println(outPutText);
    }
}
