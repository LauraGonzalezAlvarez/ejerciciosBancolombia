package com.example.ejerciciosbancolombia;
import java.util.Hashtable;

 class Alfa {
     public int GetThis(int x, int y){// quite final
        return x + y;
    }
}
class Beta extends Alfa {

    public int GetThis(int x, int y) {
        return x - y;
    }
}

    public class TestThis {
        public static void main(String[] args) {
            Beta b = new Beta();
            System.out.println("x = " + b.GetThis(0,2));

//            int[] myList= {1, 2, 3};
//            System.out.println("myList.length = " + myList.length);
        }

    }

