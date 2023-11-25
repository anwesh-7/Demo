package com.tlsk.week4;

interface IN {
    // All variable in Interface are final static by default
    // We need to assign values for final static at declaration time.
    int age = 27;
    String area = "BLG";
    // In Interface, all declarations are public abstract by default.
    // Diff B/W Abstract class and interface was that abstract class hold both abstract and non-abstract methods.
    // But in interface , we have only abstract methods

    void show();

    void config();

}

class AH implements IN {  // Concrete class for IN interface
    public void show() {
        System.out.println("In  Show");
    }

    public void config() {
        System.out.println("In Config");
    }
}

public class InterfaceClass {
    public static void main(String[] args) {
//      IN obj = new IN();   We cannot create object for interface.
        AH obj = new AH();   // We can create object for concrete class of interface.
        obj.show();
        obj.config();
//      IN.age = 30; we cannot the variable value of interface, as all are final
        System.out.println(IN.age +" : "+ IN.area); // We can call the variable of interface directly by Interface name
        // as all variables are static.
    }
}
