package com.nextassignment;

public class Reverse {
    public static void main(String[] args)
    {
        int num=Integer.parseInt(args[0]);
        int reverse=0;

        while(num>0)
        {
            int rem=num%10;
           reverse=reverse*10+rem;
            num=num/10;

        }
        System.out.println(reverse);
    }
}
