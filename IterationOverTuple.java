package org.example;

import org.javatuples.Quartet;

public class IterationOverTuple {

    public static void main(String[] args) {
        Quartet<String, Double, Integer, String> quartet = Quartet.with("Dell", 5600.00 , 34 , "Digital Solution");

        for(Object object: quartet){
            System.out.println(object);
        }
    }
}
