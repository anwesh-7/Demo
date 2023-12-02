package com.tlsk.week5;

import java.util.*;

public class SetClassC {
    public static void main(String [] args){
        // Set is an Interface.
        // Set doesn't follow any insertion order.
        // Set doesn't allow duplicate values.
        // Set doesn't work with index, as it doesn't follow insertion order.
        // Inplace of set, we can use collection interface.
        // HashSet doesn't sort the elements.
        Set<Integer> nums = new HashSet<Integer>() ;
        nums.add(52);
        nums.add(27);
        nums.add(60);
        nums.add(45);
        nums.add(27);
        nums.add(99);
        System.out.println("Set Interface");
        System.out.println(nums); // We can print vales directly. Set is []
        for(int n : nums){
            System.out.println(n);
        }
        // Inplace of set, we can use collection interface.
        Collection<Integer> nums2 = new HashSet<Integer>() ;
        nums2.add(52);
        nums2.add(27);
        nums2.add(60);
        nums2.add(45);
        nums2.add(27);
        nums2.add(99);
        System.out.println("Collection Interface");
        System.out.println(nums2);
        for(int n : nums2){
            System.out.println(n);
        }
        // TreeSet does sort the elements.
        Set<Integer> nums3 = new TreeSet<Integer>() ;
        nums3.add(52);
        nums3.add(27);
        nums3.add(60);
        nums3.add(45);
        nums3.add(27);
        nums3.add(99);
        System.out.println("TreeSet Class");
        System.out.println(nums3); // We can print vales directly. Set is []
//        for(int n : nums3){
//            System.out.println(n);
//        }
        System.out.println("Iterator Class");
        // Before enhanced for loop, we are using Iterator to get elements
        // We need to create iterator for the required array.
        // hasNext() check whether the array has next element or not.
        // next() gives the current5 value
        Iterator<Integer> itr = nums3.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
