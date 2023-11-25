package com.tlsk.week4;

class AA {
    protected void show() {
        System.out.println("In AA Show");
    }
}

class AB extends AA {
    protected void show1() {
        System.out.println("In AB Show");
    }
}

public class UpandDownCasting {
    public static void main(String[] args) {
        AA obj = new AA();
        obj.show(); // We are able to call only AA methods
        AA obj1 = new AB(); // Here Reference is AA and object is AB
        obj1.show(); // Still We are able to call only AA methods. Here Reference is AA and object is AB
        AA obj2 = (AA)new AB(); // This is known as Upcasting. This is same as  AA obj1 = new AB();.
        // (AA) is default even if we didn't mention.
        obj2.show(); // Still We are able to call only AA methods. Here Reference is AA and object is AB

        AB obj3 = (AB) obj1; // This is known as Down casting. We are converting AA reference to AB reference by casting.
        // obj1 is already consists the AB object.
        obj3.show(); // We are able to call only AA methods. Here Reference is AB and object is AB
        obj3.show1(); // We are able to call only AB methods. Here Reference is AB and object is AB
    }
}
