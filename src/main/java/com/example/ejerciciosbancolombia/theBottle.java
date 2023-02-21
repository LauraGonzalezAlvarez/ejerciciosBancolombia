package com.example.ejerciciosbancolombia;

import java.util.HashMap;
import java.util.Map;

public class theBottle {

    // Punto 24
    public class thebottle {
        public static int emptyBottle(int ballsinbottle){
            if(ballsinbottle > 0){
                System.out.print(ballsinbottle);
                return  emptyBottle(ballsinbottle - 1);
            }else {
                return ballsinbottle;
            }
        }
    }

    // Punto 25



    public static void main(String[] args) {

    System.out.print(thebottle.emptyBottle(thebottle.emptyBottle(3)));


    }
}
