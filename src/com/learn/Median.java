package com.learn;

import java.util.Arrays;
import java.util.Scanner;

public class Median {
    public static void main(String[] args)
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        int d=Integer.parseInt(args[3]);
        int e=Integer.parseInt(args[4]);

        int arr[]={a,b,c,d,e};
        Arrays.sort(arr);
        System.out.println("Median" +arr[2]);

    }
}
