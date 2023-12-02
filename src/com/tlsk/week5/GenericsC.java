package com.tlsk.week5;
class Stud<T>{
    T obj;
    public Stud(T obj) {
        this.obj= obj;
    }
    public void disp(){
        System.out.println(obj);
        System.out.println(obj.getClass().getName());
    }
}
public class GenericsC {
    public static void main(String[] args) {
        Stud<Integer> st1 = new Stud<>(10);
        st1.disp();
        Stud<String> st2 = new Stud<>("Anvi");
        st2.disp();
    }
}
