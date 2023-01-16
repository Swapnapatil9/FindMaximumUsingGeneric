package com.bridgelabz;

public class FindMaximum {
        public static <T extends Comparable<T>> T maximumFloat(T x, T y, T z){
            T max= x;
            if(y.compareTo(max) > 0)
                max= y;
            if(z.compareTo(max) > 0)
                max= z;
            return max;
        }
    public static void main(String[] args) {
        System.out.println("Welcome to Find maximum problem using Generics ");
        System.out.println("Maximum of three float is :" +maximumFloat(2.1f,3.2f,5.1f));
        System.out.println("Maximum of three float is :" +maximumFloat(3.5f,2.1f,4.2f));
    }
}
