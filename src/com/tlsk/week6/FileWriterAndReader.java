package com.tlsk.week6;

import java.io.*;

public class FileWriterAndReader {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Anwesh Daddala\\Telusuko\\";
        File file = null;
        FileWriter fw = null;
        FileReader fr = null;
        try {
            file = new File(filePath + "java.txt");
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File was created");
            }
            else{
                // Everything treating as Character
                // Integers will be converted to char
                // It will write char by char to file
                fw = new FileWriter(file);
                fw.write(69);
                fw.write("\n");
                fw.write("v");
                fw.write("\n");
                fw.write("Anvi");
                fw.write("\n");
                char[] c = {'A', 'N','V','I'};
                fw.write(c);
                fw.close();
            }
        } catch (IOException e) {
            System.out.println("Problem");
            throw new RuntimeException(e);
        }
        //=======================================================================================
        // File Reader
        try{
            fr = new FileReader(new File(filePath + "java.txt"));
            // FileReader will read data char by char from file.
            // It will return integer values(Decimal Values of char).
            char[] ch = new char[(int)new File(filePath + "java.txt").length()];
            fr.read(ch);
            for(char cv : ch){
                System.out.println(cv);
            }
            int i = fr.read();
            // -1 indicates that file ended
            while(i!=-1){
                // We need to type cast, if we want to see the chars
                System.out.println(i + " : " + (char)i);
                i = fr.read();
            }
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
