package com.tlsk.week5;
class GY{
    int count;
    public synchronized void increment(){
         count++;
    }
}
public class RaceCode {
    public static void main(String [] args){
       GY obj = new GY();
        Runnable obj1 = () ->
        {
            for(int i=1;i<=1000;i++)
            {
               obj.increment();
            }
        };
        Runnable obj2 = () ->
        {
            for(int i=1;i<=1000;i++)
            {
                obj.increment();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(obj.count);
    }
}
