package org.example.HomeWork26.p2;

import org.example.HomeWork26.p1.X;

public class Y extends X {
   Y(){
   };
 public void abc(){
       System.out.println("Y");
   }

    public static void main(String[] args) {
//        Y y = new Y();
//        y.abc();
        X x = new Y();
        x.abc();
    }

}
