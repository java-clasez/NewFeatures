package com.java.clasez.features;

import java.util.ArrayList;
import java.util.List;

public class Loops {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();

        // Old way of 'for' loop
        for(int i=0; i<10; i++) {
            numbers.add("Number " + (i+1));
        }

        System.out.println(numbers);


        // Print each value in a separate line
        //for(int i=0; i<numbers.size(); i++) {
        //    System.out.println("> " + numbers.get(i));
        //}

        // 'for each' loop
        for(String x: numbers) {
            System.out.println(x);
        }
    }
}
