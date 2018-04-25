package com.codecool.expertSystem;

import java.util.Scanner;

public class UI {
    Scanner scanner = new Scanner(System.in);

    public String userInput(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

}