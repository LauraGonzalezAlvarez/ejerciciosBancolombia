package com.example.ejerciciosbancolombia;

import java.util.ArrayList;

public class CodigoConErrores {
    public static void main(String[] args) {
        ArrayList array = new ArrayList<>(8);
        array.add(44);
        array.add(65);
        array.add(33);
        array.add(42);
        array.add(13);
        array.add(31);
        array.add(44);//6
        array.add(51);

        int element = array.lastIndexOf(44);
        System.out.println("Index = " + element);
    }
}
