package com.tlsk.week4;

class Computer{
   // protected keyword gives access to same class and inherited classes only
    protected void show(){
        System.out.println("In Computer Show");
    }
    protected void show1(){
        System.out.println("In Computer2 Show");
    }
}
class Laptop extends Computer{
    protected void show(){
        System.out.println("In Laptop Show");
    }
    protected void show2(){
        System.out.println("In Laptop2 Show");
    }
}
class Desktop extends Computer{
    protected void show(){
        System.out.println("In Desktop Show");
    }
}
public class DynamicMDPoly {
    public static void main(String[] args){
        // Dynamic method dispatching_Run time Polymorphism.
        // Need to create Parent Reference. With that ref we need to create diff object as shown below.
        Computer obj = new Computer();
        obj.show();
        obj = new Laptop();
        obj.show();
        obj = new Desktop();
        obj.show();
        //**********************************************
        // Parent object doest know child methods. So cannot be called. Will cover more under Up and Down Casting topic
//        obj.show1();  // Parent method.Tyring to access with parent object
//        obj.show2();   // Child method.Tyring to access with parent object. Not possible

        // Child Object get all methods and variable from parents. So can be called with child object.
        Laptop obj1 = new Laptop();
        obj1.show1(); // Parent method.Tyring to access with child object
        obj1.show2(); // Child method.Tyring to access with child object


    }

}
