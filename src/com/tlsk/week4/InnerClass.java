package com.tlsk.week4;
class AC{
    protected int age;
    protected void show(){
        System.out.println("In AC Show");
    }
    class AD{
        protected void show1(){
            System.out.println("In AD Show");
        }
        class ADA{
            protected void show11(){
                System.out.println("In ADA Show");
            }
        }
    }
   static class AE{
        protected void show2(){
            System.out.println("In AE Show");
        }
       class AEA{
           protected void show21(){
               System.out.println("In AEA Show");
           }
       }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        AC obj = new AC();
        obj.show();
        // Outer class treats inner class as a method. So, to call an inner class, we need to use outer class object.
        AC.AD obj1 = obj. new AD(); // If we want to create object for inner class, we need to use object of outer class.
        obj1.show1();
        // If inner class is a static class, no need to create object for inner class. we can call by class name
        AC.AE obj2 = new AC.AE(); // Here the 2 nd inner class was Static type. So, no need to use Outer class object
        obj2.show2();
        // Inner Class inside inner class
        AC.AD.ADA obj3 = obj1. new ADA();
        obj3.show11();
        // Inner Class inside static inner class
        AC.AE.AEA obj4 = obj2. new AEA();
        obj4.show21();
    }
}
