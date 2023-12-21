package com.tlsk.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAndParralelStream {
    public static void main(String [] args){
        // General type of adding elements.
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(8);
        // We can add elements by using asList method from Arrays class
        List<Integer> nums2 = Arrays.asList(3,7,9,4);
        // Printing all elements one by one with for loop
        for (int i=0;i<nums2.size();i++){
            System.out.println(nums2.get(i));
        }
        // Printing all elements one by one with for each
        for (int i : nums2){
            System.out.println(i);
        }
        // Printing all elements one by one with forEach Method
        // Consumer is a Functional Interface which has accept method.
        // It gets all elements from array one by one
        Consumer<Integer> cum = new Consumer<Integer>() {
            public void accept(Integer n) {
                System.out.println(n);
            }
        };
        nums.forEach(cum);
        // The above implementation can be reduced by using lambda expression as below
        nums2.forEach(n -> System.out.println(n));

        // Stream is an interface.
        // It creates the duplicate for the array
        // We can perform only one operation with one stream.
        // We need to create multiple streams to work with multiple logics.
        List<Integer> val = new ArrayList<>(10);
        Random rdm = new Random();
        for (int i = 0;i<5;i++){
            val.add(rdm.nextInt(100));
        }
        // Creating Stream
        Stream<Integer> st1 = val.stream();
        // We are using st1 stream for printing.
        st1.forEach(n -> System.out.println(n));
//        st1.forEach(n -> System.out.println(n)); // We will get runtime error as st1 ia already use in above print.
        // so we need to create new stream for every operation as below
        Stream<Integer> st2 = val.stream();
        Stream<Integer> st3 = st2.filter(n -> n%2 == 0);
        Stream<Integer> st4 = st3.map(n -> n*2);
      int result =  st4.reduce(0,(c,e) -> c+e);
        System.out.println(result);
        // Enhanced way of using stream is as below.
        int result2 = val.stream()
                .filter(n -> n%2 == 0)
                .map(n -> n*2)
                .reduce(0,(c,e) -> c+e);
        System.out.println(result2);
        // We can write the same in single line
        int result3 = val.stream().filter(n -> n%2 == 0).map(n -> n*2).reduce(0,(c,e) -> c+e);
        // We have sorted operation as below.
        Stream<Integer> sortedv = val.stream().filter(n -> n%2==0).sorted();
        sortedv.forEach(n -> System.out.println(n));
        // More on stream methods
        // Filter
        Predicate<Integer> pd = new Predicate<Integer>() {
            public boolean test(Integer n) {
                return n%2 == 0;
            }
        };
        // We can replace above with lambda
        Predicate<Integer> pd2 = n -> n%2 == 0;
        // Map
        Function<Integer,Integer> fun = new Function<>() {
            public Integer apply(Integer n) {
                return n*2;
            }
        };
        // We can replace above with lambda
        Function<Integer,Integer> fun2= n -> n*2;
        // Stream Creation for above objects
        int res = nums2.stream().filter(pd2).map(fun2).reduce(0,(c,e) -> c+e);
        System.out.println(res);
        // We can replace above object with direct lambda implement
        int res2 = nums2.stream().filter(n -> n%2 == 0).map(n -> n*2).reduce(0,(c,e) -> c+e);
        System.out.println(res2);

        // Diff B/w Stream and Parallel Stream
        // Both works same manner. We use parallel stream when we have large amount of data.
        // It works on thread creation
        int size = 10_000;
        List<Integer> strm = new ArrayList<>(size);
        for (int i = 0;i<size;i++){
            strm.add(rdm.nextInt(100));
        }
        int sum1 = strm.stream().map(n -> n*2).reduce(0,(c,e) -> c+e);
        // mapToInt convert the element to integer.Sum is available only for integer.
        long seqStart = System.currentTimeMillis();
        int sum2 = strm.stream().map(n ->
        {
            try {
                Thread.sleep(1);
            }
            catch (Exception e){

            }
            return n*2;
        })
                .mapToInt(n -> n).sum();
        long seqEnd = System.currentTimeMillis();
        long parStart = System.currentTimeMillis();
        int sum3 = strm.parallelStream().map(n ->
                {
                    try {
                        Thread.sleep(1);
                    }catch (Exception e){

                    }
                    return n*2;
                })
                .mapToInt(n -> n).sum();
        long parEnd = System.currentTimeMillis();
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println("Seq : " + (seqEnd-seqStart));
        System.out.println("Par : " + (parEnd-parStart));
    }
}
