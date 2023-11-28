package com.tlsk.week5;
// Threads cannot be crated for normal classes.
// So, we need to extend those classes with Thread class.
// Thread executes only run() method in class
// Thread execution happens parallel. It depends on scheduler.
class AY extends Thread{
    public void show(){ // changing show() to run()
        for(int i=1;i<=3;i++){
            System.out.println("Hi : "  + i);
        }
    }
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
class AV extends  Thread{
    public void show(){
        for(int i=1;i<=3;i++){
            System.out.println("Hello : "  + i);
        }
    }
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
public class ThreadsCreation {
    public static void main(String [] args){
        AY obj1 = new AY();
        AV obj2 = new AV();
        // We are changing show() method to start() method
        obj1.show();
        obj2.show();
        // By default, thread priority was 5, which is medium. It ranges from (1 to 10). Least is 1 and Max is 10.
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());
        // We can set priority for threads. We can do in two ways.
        // By using priority, we can only suggest to scheduler. But it is scheduler wish to execute.
        //Usually schedule will assign some time execute each threads
//        obj2.setPriority(10);
        obj2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj2.getPriority());
        // start() is used to create new Thread for class
        obj1.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();
    }
}
