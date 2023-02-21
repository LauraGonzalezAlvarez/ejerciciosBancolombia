package com.example.ejerciciosbancolombia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<String> myStringList = new ArrayList<>();
        myStringList.add("Alfa");
        myStringList.add("Beta");
        myStringList.add("Gama");

        Iterator<String> myListIterator = myStringList.iterator();
        while(myListIterator.hasNext()){
            String val = myListIterator.next();
            if(val =="Beta"){
                myListIterator.remove();
            }
        }
        for(int i=0; i<myStringList.size();i++){
            System.out.println(myStringList.get(i));
        }
    }
}
