package com.tlsk.week6;

import java.io.*;

class Student3 implements Serializable
{
    String name;
    String id;
    // Transient exclude the serialization.
     transient int age;
    String role;

    public Student3(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    void disp(){
        System.out.println("Name : "+ name);
        System.out.println("Id : "+ id);
        System.out.println("Age : "+ age);
        System.out.println("Role : "+ role);
    }
}
public class SerializationAndDeSerialization {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Anwesh Daddala\\Telusuko\\";
//        Student3 std1 = new Student3("Anvi", "Soft", 27);
//        std1.role = "QA";
//        std1.disp();
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        ObjectOutputStream oos = null;
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        ObjectInputStream ois = null;

        {
            try {
//                fos = new FileOutputStream(filePath + "serial.txt");
//                bos = new BufferedOutputStream(fos);
//                oos = new ObjectOutputStream(bos);
//                oos.writeObject(std1);
//                oos.writeChars("\n");
//                oos.writeBytes(std1.role);
//                oos.close();
//                fos.close();
                fis = new FileInputStream(filePath + "serial.txt");
                bis = new BufferedInputStream(fis);
                ois = new ObjectInputStream(bis);
               Student3 st = (Student3) ois.readObject();
               ois.close();
               fis.close();
               st.disp();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
