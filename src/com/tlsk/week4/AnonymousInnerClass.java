package com.tlsk.week4;
class AG{
   protected void show() {
        System.out.println("In AG Show");
    }
}
abstract class AS{
    protected abstract void show1();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        // Anonymous inner class
        AG obj = new AG()
        {
            public void show() {
                System.out.println("Anonymous inner class");
            }
        };
        obj.show();
        // Abstract Anonymous inner class
        AS obj1 = new AS()
        {
            protected void show1() {
                System.out.println("Abstract Anonymous inner class");
            }
        };
        obj1.show1();
    }
}
