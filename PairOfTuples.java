package org.example;

import org.javatuples.Pair;

public class PairOfTuples {

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.with(908651,"Dell Laptop");
        System.out.println(pair);
    }
}
