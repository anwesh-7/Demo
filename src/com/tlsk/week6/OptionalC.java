package com.tlsk.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalC {
    public static void main(String [] args){
        // Optional class is used to avoid Null point exception.
        List<String> names = Arrays.asList("Anvi","Jasu","Charan");
        Optional<String> value = names.stream()
                .filter(name -> name.contains("J")).findFirst();
        System.out.println(value.get());
        List<String> names2 = Arrays.asList("Anvi","Casu","Jharan");
        String value2 = names2.stream()
                .filter(name -> name.contains("J")).findFirst().get();
        System.out.println(value2);
        List<String> names3 = Arrays.asList("Anvi","Casu","Jharan");
        String value3 = names3.stream()
                .filter(name -> name.contains("J")).findFirst().toString();
        System.out.println(value3);
        // If condition fails, it will through no such element exception.
        // We can define our own exception as below
        List<String> namesErr = Arrays.asList("Anvi","kasu","Charan");
        Optional<String> valueErr = namesErr.stream()
                .filter(name -> name.contains("J")).findFirst();
        System.out.println(valueErr.orElse("Not found"));
        List<String> namesErr1 = Arrays.asList("Anvi","kasu","Charan");
        String valueErr1 = namesErr1.stream()
                .filter(name -> name.contains("J")).findFirst().orElse("Not found");
        System.out.println(valueErr1);
    }
}
