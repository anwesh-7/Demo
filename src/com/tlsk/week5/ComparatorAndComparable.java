package com.tlsk.week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Comparable is an Interface which need to implements by a Class
// Comparable is best for object sorting. It deals with class objects
class Student implements Comparable<Student> {
    String name;

    public Student(String name) {
        this.name = name;
    }
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public int compareTo(Student obj) {
        if (this.name.length() > obj.name.length() )
            return 1;
        else
            return -1;
    }
}

public class ComparatorAndComparable {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(52);
        nums.add(27);
        nums.add(60);
        nums.add(45);
        nums.add(99);
        // Basic Sorting. Default by Collection Interface.
        Collections.sort(nums);
        System.out.println(nums);
        // Create Comparator to work with our own Sorting Logic.
        // We can use lambda Expression for comparator.
        // We need to specify generics on both sides
        Comparator<Integer> cmp = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10)
                    return 1;
                else
                    return -1;
            }

            ;
        };
        List<Integer> nums2 = new ArrayList<>();
        nums2.add(52);
        nums2.add(27);
        nums2.add(60);
        nums2.add(45);
        nums2.add(99);
        // Sorting with our own logic using comparator Interface.
        Collections.sort(nums2, cmp);
        // We can also use List.sort() to use our own logic
//        nums2.sort(cmp);
        System.out.println(nums2);

        //  Comparator using lambda Expression
        Comparator<String> cmp2 = ( i,j) -> i.length() > j.length() ? 1:-1;
        List<String> names = new ArrayList<>();
        names.add("Anwesh");
        names.add("Charan reddy");
        names.add("Jasu");
        names.add("Bhanu");
        Collections.sort(names, cmp2);
        System.out.println(names);

        List<Student> stds = new ArrayList<>();
        stds.add(new Student("light"));
        stds.add(new Student("Powders"));
        stds.add(new Student("Height Over"));
        stds.add(new Student("Heavy"));
        Collections.sort(stds);
        System.out.println(stds);
    }

}
