package com.java.clasez.features;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(numbers);

        int sum = 0;

        for(int n: numbers){
            System.out.println("Adding " + n);
            sum += n;
        }

        System.out.println("Sum of all numbers: " + sum);

    }
}