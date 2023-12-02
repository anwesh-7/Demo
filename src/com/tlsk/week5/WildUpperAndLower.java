package com.tlsk.week5;

import java.util.ArrayList;
import java.util.List;

class Hm{
    public void slep(){
        System.out.println("Human Sleep");
    }
}
class Em extends Hm{
    public void slep(){
        System.out.println("Employe Sleep");
    }
}
class St{
    public void slep(){
        System.out.println("Student Sleep");
    }
}

public class WildUpperAndLower {
    public static void main(String[] args) {
        Hm hm = new Hm();
        Hm hm2 = new Hm();
        Em em = new Em();
        Em em2 = new Em();
        hm=em; // Object assign is possible for is-a relation

        ArrayList<Hm> hmList = new ArrayList();
        hmList.add(hm);
        hmList.add(hm2);
        ArrayList<Em> emList = new ArrayList();
        emList.add(em);
        emList.add(em2);
        ArrayList<St> stList = new ArrayList();
        ArrayList<Object> obList = new ArrayList();
//        hmList = emList; // Doesn't work because datatype mismatch even if we have is-a relation
        // Wild card creation
        // Wild card is noting but unknown Data type.
        // It will accept any Data Tpe irrespective of relation.
        // To control this, we need to use Upper and Lower boundaries.
        ArrayList<?> hmwildList = new ArrayList();
        hmwildList = emList; // Possible now because of wild card type.
        hmwildList = hmList;
        ArrayList<Hm> hmList1 = new ArrayList();
        ArrayList<Em> emList1 = new ArrayList();
        // Upper Boundary Creation.
        // It works with current and child relation
        ArrayList<? extends Hm> upperList = new ArrayList();
        upperList = hmList;
        upperList = emList;
//        upperList = stList; // Doesn't work as no is-a relation
//        upperList = obList; // Doesn't work as Super class won't work

        // Lower Boundary Creation.
        // It works with current and Parent relation
        ArrayList<? super Hm> lowerList = new ArrayList();
        lowerList = hmList;
        lowerList = obList; // Works because of super class
//        lowerList = emList;// Doesn't work because child relation
//        lowerList = stList; // Doesn't work as no is-a relation
        ArrayList<? super Em> lowerList2 = new ArrayList();
        lowerList2 = emList;
        lowerList2 = hmList;
        lowerList2 = obList; // Works bcs of Super class relation
//        lowerList = stList; // Doesn't work as no is-a relation
        invok(hmList);
        invok(emList);
//        invok(stList); // Not possible
//        invok(obList);// Not possible
        invok2(hmList);
        invok2(emList);
        invok2(obList);
//        invok2(stList); // Not possible

    }
    static void invok(List<? extends Hm> list){
        for(Hm v : list ){
            v.slep();
        }
    }
    static void invok2(List<? super Em> list){
        for(Object v : list ){
//            v.slep();
        }
    }
}
