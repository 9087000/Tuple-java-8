package org.example;

import org.javatuples.Quartet;
import org.javatuples.Septet;
import org.javatuples.Triplet;

public class TripletQuartetSeptet {

    public static void main(String[] args) {
        Triplet<String, String, String> triplet = Triplet.with("Mango", "Grapes", "Papaya");

        Quartet<String, String , String, String> quartet = triplet.addAt1("Banana");

        Septet<String, String, String, String, String, String, String> septet = quartet.add(triplet);

        System.out.println(triplet);
        System.out.println(quartet);
        System.out.println(septet);
    }
}
