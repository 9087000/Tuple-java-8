package org.example;


import org.javatuples.Quartet;

public class Ouartet {
    public static void main(String[] args) {

        Quartet<String, String, Integer, String> quartet = new Quartet<String, String, Integer, String >("Sophia", "Female", 22, "Marketing Manager");
//print the tuples objects
        System.out.println("The details of the employee are: " + quartet);
    }
}