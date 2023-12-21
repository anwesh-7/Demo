package com.tlsk.week6;

import java.io.*;

public class PrintWr {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Anwesh Daddala\\Telusuko\\";
        File file = null;
        FileWriter fw = null;
        FileReader fr = null;
        BufferedReader br = null;
        PrintWriter pr = null;
        try {
            file = new File(filePath + "java.txt");
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File was created");
            }
            else{
                fw = new FileWriter(file);
                // PrintWriter is used to deal with both integers and Chars.
               pr = new PrintWriter(fw);
                pr.println(69);
                pr.write(69);
                pr.write("\n");
                pr.println(10);
                pr.println("v");
                pr.println(true);
                pr.println("Anvi");
                char[] c = {'A', 'N','V','I','I'};
                pr.println(c);
                // We need to flush the data for PW
                pr.flush();
                // If We close PW, it will auto close FW
                pr.close();
            }
        } catch (IOException e) {
            System.out.println("Problem");
            throw new RuntimeException(e);
        }
        //=======================================================================================
        // Buffered Reader
        try{
            fr = new FileReader(new File(filePath + "java.txt"));
            // BufferedReader is used to enhance the process
            br = new BufferedReader(fr);
            // BufferedReader will read data char by char  and is possible to read entire line at once from file.
            // It will return String values.
            String  str = br.readLine();
            // -1 indicates that file ended
            while(str!=null){
                // We need to type cast, if we want to see the chars
                System.out.println(str);
                str = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
