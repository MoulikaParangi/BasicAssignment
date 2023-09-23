package com.nextassignment;

import java.net.Inet4Address;

public class Positive {

    public static void main(String[] args)
    {
        int n= Integer.parseInt(args[0]);
        if(n>0)
        {
            System.out.println("Positive number");
        }
        else if(n<0)
        {
            System.out.println("Negative number");
        }
        else {
            System.out.println("Zero");
        }
    }
}
