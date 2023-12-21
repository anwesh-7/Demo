package com.tlsk.week6;

import java.io.*;

public class BufferWriterAndReader {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Anwesh Daddala\\Telusuko\\";
        File file = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            file = new File(filePath + "java.txt");
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File was created");
            }
            else{
                fw = new FileWriter(file);
                // BufferedWriter is used to enhance the process.
                // Everything treating as Character
                // Integers will be converted to char
                // It will write char by char to file
                bw = new BufferedWriter(fw);
                bw.write(69);
                bw.newLine();
                bw.write("v");
                bw.newLine();
                bw.write("Anvi");
                bw.newLine();
                char[] c = {'A', 'N','V','I','I'};
                bw.write(c);
                // We need to flush the data for BW
                bw.flush();
                // If We close BW, it will auto close FW
                bw.close();
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
