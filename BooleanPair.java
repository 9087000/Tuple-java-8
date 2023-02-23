package org.example;

import org.javatuples.Pair;

public class BooleanPair {

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.with(34, "Jack");

        boolean res1 = pair.contains("Andrew");

        boolean res2 = pair.contains("Jack");

	boolean res3 = pair.contains("Test");

        System.out.println(res1);

        System.out.println(res2);

	System.out.println(res3);
    }
}
