package com.nextassignment;

public class Evenodd {
    public static void main(String[] args)
    {
        int number=Integer.parseInt(args[0]);
        if(number%2==0)
        {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }
}
