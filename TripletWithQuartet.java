package org.example;

import org.javatuples.Quartet;
import org.javatuples.Triplet;

public class TripletWithQuartet {
    public static void main(String[] args) {
        Triplet<String, String, String> triplet = Triplet.with("MCA", "M.Sc", "MBBS");

        Quartet<String, String, String, String> quartet = triplet.addAt2("M.Tech");

        System.out.println(triplet);

        System.out.println(quartet);
    }
}
