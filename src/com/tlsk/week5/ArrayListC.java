package com.tlsk.week5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListC {
    public static void main(String [] args){
        // Collection is an Interface.
        // Collection doesn't work with indexes
        // ArrayList follows the order
        // ArrayList can have Duplicate values.
        Collection nums = new ArrayList() ;
        // Add() is used to insert the elements into array.
        nums.add(52);
        nums.add(60);
        nums.add(45);
        nums.add(27);
        nums.add(99);
        System.out.println("Collection Interface without Generics");
        System.out.println(nums); // We can print vales directly. list is []
        for(Object n : nums){
            //Without using <> generic, we need to typecast the value as it is an object
           int nn = (Integer) n;
            System.out.println(nn);
        }
        Collection<Integer> nums1 = new ArrayList<Integer>() ;
        // Add() is used to insert the elements into array.
        nums1.add(56);
        nums1.add(63);
        nums1.add(45);
        nums1.add(27);
        nums1.add(99);
        System.out.println("Collection Interface with Generics");
        for(int n : nums1){
//            int nn = (Integer) n;
            System.out.println(n);
        }
        // List is an Interface.
        // List work with indexes
        // List follows the insertion order
        List<Integer> nums2 = new ArrayList<Integer>() ;
        // Add() is used to insert the elements into array.
        nums2.add(56);
        nums2.add(63);
        nums2.add(45);
        nums2.add(27);
        nums2.add(99);
        System.out.println("List Interface");
        System.out.println( nums2.get(3));
        System.out.println( nums2.indexOf(63));
        for(int n : nums2){
            System.out.println(n);
        }
    }
}
