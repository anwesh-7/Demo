package com.tlsk.week6;

import java.io.File;

public class IOAPI {
    public static void main(String [] args){

        String filePath = "C:\\Users\\Anwesh Daddala\\Telusuko\\";
        String folderPath = "C:\\Users\\Anwesh Daddala\\Telusuko\\Data";
        File file = null;
        File file2 = null;
        try {
           file = new File(filePath + "java.txt");
           file2 = new File(folderPath);
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File was created");
            } else{
                System.out.println("File was already Present");
            }
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.getAbsolutePath());
            if (!file2.exists()) {
                file2.mkdir(); 
                System.out.println("Folder was created");
            } else{
                System.out.println("Folder was already Present");
            }
            System.out.println(file2.isFile());
            System.out.println(file2.isDirectory());
            System.out.println(file2.getAbsoluteFile());
            System.out.println(file2.getAbsolutePath());
        }
        catch(Exception e){
            System.out.println("Something Happened");
        }
    }
}
