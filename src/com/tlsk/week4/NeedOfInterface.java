package com.tlsk.week4;
interface Computerr{
    void code();
}
class Laptopp implements Computerr
{
    public void code() {
        System.out.println("In  Laptop");
    }
}
class Desktopp implements Computerr
{
    public void code() {
        System.out.println("In  Desktop");
    }
}
class Devp{
    public void devCode(Computerr obj){
       obj.code();
    }
}
public class NeedOfInterface {
    public static void main(String[] args) {
        Devp anwi = new Devp();
        Computerr obj = new  Computerr()
        {
            public void code() {
                System.out.println("In  Computer");
            }
        };
        obj.code();
//        Computerr obj1 = new Laptopp();
//        Computerr obj2 = new Desktopp();
        anwi.devCode(new Laptopp());
        anwi.devCode(new Desktopp());

    }
}
