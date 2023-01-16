package com.bridgelabz;

public class FindMaximum <T>{
    public static <T extends Comparable<T>> T maximumInteger(T x, T y, T z){
        T max= x;
        if(y.compareTo(max) > 0)
            max= y;
        if(z.compareTo(max) > 0)
            max= z;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Find maximum problem using Generics ");
        System.out.println("Maximum of three integer is :" +maximumInteger(2,3,5));
        System.out.println("Maximum of three integer is :" +maximumInteger(5,7,3));
    }
}
