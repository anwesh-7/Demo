package com.tlsk.week5;
class  AK implements Runnable{
    public void run(){ // changing show() to run()
        for(int i=1;i<=5;i++){
            System.out.println("Hi run : "  + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class AI implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello run : "  + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class RunnableThread {
    public static void main(String [] args){
        //Parent Ref and child object
        Runnable obj1 = new AK();
        Runnable obj2 = new AI();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        // Without using child class to implement runnable , we have this pattern.
        Runnable obj3 = () -> {
                for(int i=1;i<=5;i++){
                    System.out.println("Hi run : "  + i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        };
        Runnable obj4 = () -> {
                for(int i=1;i<=5;i++){
                    System.out.println("Hello run : "  + i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        };
        Thread t3 = new Thread(obj3);
        Thread t4 = new Thread(obj4);
        t3.start();
        t4.start();
    }

}
