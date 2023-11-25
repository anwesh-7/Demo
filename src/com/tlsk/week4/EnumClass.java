package com.tlsk.week4;
//Enum class can have variables, methods and constructors.
//Enum class cannot be extended with other classes.
enum Status{
    Mackbook(2000), Lenova(3000), XPS(4000), HP(5000),Running, Pending, Failed, Success;
 private int price;

    Status() {
    }
    Status(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}
public class EnumClass {
    public static void main(String[] args) {
        System.out.println(Status.Running);
        System.out.println(Status.Failed.ordinal());
        Status ss = Status.Success;
        // By default, Enum class is extended with Enum class of java
        System.out.println(ss.getClass().getName()+ " : " +ss.getClass().getSuperclass());
        Status lap = Status.Mackbook;
        System.out.println(lap + " : " + lap.getPrice());
        for(Status s : Status.values()){
            System.out.println(s + " : " + s.ordinal());
            if(s.ordinal() < 4) System.out.println(s + " : " + s.getPrice());
            switch(s){
                case Running:
                    System.out.println("All Good");
                    break;
                case Pending:
                    System.out.println("Waiting");
                    break;
                case Failed:
                    System.out.println("Better Luck");
                    break;
                case Success:
                    System.out.println("Done");
                    break;
                default:
                    System.out.println("Constructor" + " : " + s);
                    break;
            }
        }
    }
}
