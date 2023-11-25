package com.tlsk.week4;

import java.util.Objects;

class A{
     String model;
     int price;

    public String toString() {
        return "A{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
    public boolean equals(Object o) {
        // this refers to obj2 and Object o refers to obj1
        if (this == o) return true;
        if (!(o instanceof A a)) return false;
        return price == a.price && Objects.equals(model, a.model);
    }

    public int hashCode() {
        return Objects.hash(model, price);
    }
}
public class ObjectClass {

    public static void main(String[] args){
        A obj1 = new A();
        obj1.model = "Samsung";
        obj1.price = 10000;
        System.out.println(obj1.getClass().getName());
        System.out.println(obj1.toString());
        A obj2 = new A();
        obj2.model = "Samsung";
        obj2.price = 10000;
        // this refers to obj2 and Object o refers to obj1
        System.out.println(obj2.equals(obj1));
        System.out.println(obj1.hashCode());
    }
}
