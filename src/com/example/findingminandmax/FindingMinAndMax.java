package com.example.findingminandmax;

public class FindingMinAndMax {
    public static void main(String[] args) {
        System.out.println("This program creates a one-dimensional array with 10 elements and find the smallest and the largest element.");
        int lowerLimit = 1;
        int upperLimit = 100;
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * (upperLimit + 1 - lowerLimit) + lowerLimit);
        }
    }
}
