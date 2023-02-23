package org.example;

import org.javatuples.Octet;
import org.javatuples.Sextet;

import java.util.ArrayList;
import java.util.List;

public class OctetOfTuples {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("C");
        list.add("C++");
        list.add("Java");
        list.add("Python");
        list.add("Scala");
        list.add("Ruby");
        list.add("PHP");
        list.add("COBOL");

        Octet<String, String, String, String, String, String, String , String> p1 = Octet.fromCollection(list);

        String[] arr = {"One", "Two", "Three", "Four", "Five", "Six"};

        Sextet<String, String, String, String, String, String> p2 = Sextet.fromArray(arr);

        System.out.println(p1);

        System.out.println(p2);
    }
}
