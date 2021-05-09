package com.company;

public class BinarySearch {
    public static void main (String[] args){

    }
    public static int binarySearch (int[] a, int b){
        int low =0;
        int high = a.length -1;

        while (low <= high){
            int midle = low + (high - low) /2;
            if (b < a[midle]){
                high = midle -1;
            }else if (b > a[midle]){
                low = midle +1;
            }else {
                return midle;
            }
        }
        return -1;
    }
}
