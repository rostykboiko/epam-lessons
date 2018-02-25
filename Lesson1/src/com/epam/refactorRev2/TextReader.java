package com.epam.refactorRev2;

import java.util.Scanner;

public class TextReader {
    private String line;
    private Scanner scanner = new Scanner(System.in);


    public String readLine(){
        return line = scanner.nextLine();
    }
}
