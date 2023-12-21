package com.tlsk.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;
class Stud{
    private String name;
    public Stud() {
    }
    public Stud(String name) {
        this.name = name;
    }
    public String toString() {
        return "Stud{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class MethodRefAndConstRef {
    public static void main(String[] args) {

        List<String> val = Arrays.asList("Anvi","Casu","Jharan");
        Random rdm = new Random();
        // Creating Stream
        Stream<String> st1 = val.stream();
        Stream<String> st2 = val.stream();
        // We are using st1 stream for printing.
        st1.forEach(n -> System.out.println(n));
        // We can replace the above with method Ref.
        // Method Ref is used when we want to perform the same operation for all elements
        // It is achieved with by using Class name or Object followed by :: and method name
        st2.forEach(System.out::println);

        // Another Example
        List<String> result3 = val.stream().map(name -> name.toUpperCase()).toList();
        System.out.println(result3);
        // We can replace above uppercase method as below
        List<String> result4 = val.stream().map(String::toUpperCase).toList();
        System.out.println(result4);

        // Construct Ref
        List<Stud> students = new ArrayList<>();
        for (String nam : val){
            students.add(new Stud(nam));
        }
        System.out.println(students);
        List<Stud> students2 = new ArrayList<>();
        students2 = val.stream().map(name -> new Stud(name)).toList();
        System.out.println(students2);
        // The above constructor can be replaced with as below by Constructor Ref
        List<Stud> students3 = new ArrayList<>();
        students3 = val.stream().map(Stud :: new).toList();
        System.out.println(students2);
    }
}
