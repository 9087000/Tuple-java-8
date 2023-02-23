package org.example;

import org.javatuples.Quintet;

public class QuintetOfTuples {
    public static void main(String[] args) {
        Quintet<Integer, String , Double, String, Integer> quintet = new Quintet<Integer, String, Double, String, Integer>(91237, "MacBook Air", 88490.00 , "8-More CPU", 4);
        System.out.println(quintet);
    }
}
