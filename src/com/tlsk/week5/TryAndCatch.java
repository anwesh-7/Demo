package com.tlsk.week5;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class OwnException extends Exception {
    public OwnException(String message) {
        super(message);
    }
}

class DuckThrows {
    // Not handling Exception here...Throws exception to where method calling. At that point we need to handel.
    public void show() throws ClassNotFoundException {
        Class.forName("ADG");
    }
}

public class TryAndCatch {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int[] num = new int[5];
        String str = null;
        try {
            // If exception found in try block, remaining code will be skipped and enters to catch block
            j = 18 / i;
            System.out.println(num[2]);
            if (j == 0) {
                // Wantedly creating exception and passing to catch block. We can pass msg in constructor.
                throw new ArithmeticException("Custom msg");
            } else {
                throw new OwnException("Custom Msz");
            }
//           System.out.println(str.length());
//           System.out.println(num[5]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot dived by Zero " + e);
        } catch (OwnException e) {
            System.out.println("Done " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index was out of range");
        } catch (Exception e) { // Parent cal should be always at bottom
            System.out.println("Some thing went wrong..." + e);
        } finally { // Will execute irrespective of Exception. It will execute after try block
            System.out.println("Try Catch Completed");
        }
        System.out.println(j);
        System.out.println("End");
        // Checked Exceptions...It uses throws.
        DuckThrows obj = new DuckThrows();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
//           e.printStackTrace();
            throw new RuntimeException(e);
        } finally { // Mostly used to close resources.
            System.out.println("Duck Throws Try Catch Completed");
        }
    }
}
