package org.example;

import org.javatuples.Quartet;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class QuartetList {

    public static void main(String[] args) {
        Quartet<String, Integer, String , Double> quartet = Quartet.with("Dog", 12, "German Shwphard", 23.89);

        List<Object> list = quartet.toList();

        System.out.println(list);

        Object[] quarletArr = quartet.toArray();

        System.out.println(Arrays.toString(quarletArr));
    }
}
