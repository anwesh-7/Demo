package com.tlsk.week5;
interface AT{
    void show();
}
interface AT1{
    void show1(int i);
}
interface AT2{
    void show2(int i, int j);
}
interface AT3{
    int add(int i, int j);
}
public class FunctionalInterfaceAndLamda {
    public static void main(String [] args){
       // General functional Interface Implementation
        AT obj = new AT() {
            public void show() {
              System.out.println("In show");
            }
        };
        obj.show();
        //Lambda Expression with zero parameters
        AT obj1 = () -> System.out.println("Lambda Expression with zero parameters");
        obj1.show();
        //Lambda Expression with one parameter
        AT1 obj2 = (int i) -> System.out.println("Lambda Expression with one parameter :" +i);
        obj2.show1(2);
        //Enhanced Lambda Expression with one parameter
        AT1 obj3 = i -> System.out.println("Enhanced Lambda Expression with one parameter :" +i);
        obj3.show1(3);
        //Lambda Expression with two or more parameters
        AT2 obj4 = (int i, int j) -> System.out.println("Lambda Expression with two or more parameters :" +(i+j));
        obj4.show2(2, 3);
        //Enhanced Lambda Expression with two or more parameters
        AT2 obj5 = (i,j) -> System.out.println("Enhanced Lambda Expression with two or more parameters :" +(i+j));
        obj5.show2(3,5);
        //Lambda Expression with return Type
        AT3 obj6 = (i, j) -> {return i+j;};
        System.out.println("Lambda Expression with return Type : " +obj6.add(7, 8));
        //Enhanced Lambda Expression with return Type
        AT3 obj7 = (i,j) -> i+j;
        System.out.println("Enhanced Lambda Expression with return Type : " + obj7.add(9,5));
    }
}
