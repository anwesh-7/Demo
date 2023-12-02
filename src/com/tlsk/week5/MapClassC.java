package com.tlsk.week5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapClassC {
    public static void main(String [] args){
        // Map is an interface. {}
        // It is Key : Value pair set.
        // We use put( , ) instead of add here.
        // Key is of Set<> type. So, it doesn't allow duplicated.
        // Value is of List<> type. So, it allows duplicated.
        // So, map can have duplicate values, but not keys.
        // If we have duplicate keys, it will be replaced.
        // It doesn't follow the insertion order.
        // It doesn't sort the elements. So, indexes won't work.
        Map<String, Integer> stud = new HashMap<String,Integer>();
        stud.put("Navin", 89);
        stud.put("Anwi", 98);
        stud.put("Kiran", 56);
        stud.put("Charan", 43);
        stud.put("Dilip", 65);
        stud.put("Charan", 88);
        System.out.println(stud);
        System.out.println(stud.get("Charan"));
        System.out.println(stud.keySet()); // keySet gives all keys which is of type Set<>.[]
        System.out.println(stud.values()); // values() gives all values which is of type List<>.[]
        for(String key : stud.keySet()){
            System.out.println(key + " : " + stud.get(key));
        }
        // Both HashMap and HashTable works same.
        // The diff was that HashTable is a synchronized one.
        Map<String, Integer> stud1 = new Hashtable<String, Integer>();
        stud1.put("Navin", 89);
        stud1.put("Anwi", 98);
        stud1.put("Kiran", 56);
        stud1.put("Charan", 43);
        stud1.put("Dilip", 65);
        stud1.put("Charan", 88);
        System.out.println(stud1);
        Map<String, Integer> stud2 = new Hashtable<String, Integer>();
        stud2.put("Kajal", 89);
        stud2.put("Priya", 98);

        Map<Integer,Map<String, Integer>> roll = new HashMap<Integer,Map<String, Integer>>();
        roll.put(1, stud1);
        roll.put(2, stud2);
        System.out.println(roll);
    }
}
