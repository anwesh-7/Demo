package com.tlsk.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputGetting {

    public void getUserInput() throws IOException {
        // Process of getting user input.
        System.out.println("User Input using read : ");
         int i = System.in.read(); // By default, read is int type.
        System.out.println(i); // It returns Hashcode of input
    }
    public void getUserInput1() throws IOException {
        System.out.println("User Input using readLine : ");
        // Process of getting user input.
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        System.out.println(bf.readLine()); // By default, readLine is string type.
//        bf.close();
    }
    public void getUserInput2() throws IOException {
        System.out.println("User Input using nextInt : ");
        // Updated version of getting User Input. It is available from 1.5
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt()); // By default, nextInt is int type.
//        sc.close();
    }

    public static void main(String[] args) {
        UserInputGetting obj = new UserInputGetting();
        try {
            obj.getUserInput();
            obj.getUserInput1();
            obj.getUserInput2();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
