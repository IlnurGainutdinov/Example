package org.example.HomeWork26.p3;

public class Test3 {
    public class X {
        public X() {
            System.out.println("X");
        }

        public X(int i) {
            System.out.println("X" + i);
        }

         public boolean abc() {
            return false;
        }




    }

    class  Y extends X {
        public Y(int i) {
            System.out.println("Y");
        }

        public boolean abc() {
            return true;
        }


    }
}

class Test4{
    public static void main(String[] args) {
        Test3 t= new Test3();
        Test3.X x = t.new Y(18);
        System.out.println(x.abc());

    }
}

