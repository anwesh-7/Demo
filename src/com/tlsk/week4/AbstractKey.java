package com.tlsk.week4;
abstract class Car{
    // Abstract method is able to hold both abstract methods and non-abstract methods
    public abstract void drive();
    public abstract void fly();
    public void music(){
        System.out.println("Play Music");
    }
}
abstract class Wagnor extends Car{

    public void drive() {
        System.out.println("Drive Car");
    }
}
class UpadtedWagnor extends Wagnor{   //concrete class. We are able to create object for concrete class.

    public void fly() {
        System.out.println("Fly Car");
    }
}
public class AbstractKey {
    public static void main(String[] args) {
//        Car obj = new Car(); // We cannot create object for abstract class.
//        Car obj = new Wagnor(); // Initially it is not abstract class. After making it as abstract , getting error.
        Car obj = new UpadtedWagnor();
        obj.drive();
        obj.music();
        obj.fly();
    }
}
