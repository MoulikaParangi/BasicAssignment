package com.nextassignment;

public class Palindrome {
    public static void main(String[] args)
    {
        int num=Integer.parseInt(args[0]);
        int number=num;
        int reverse=0;
        while(num>0)
        {
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        if(number==reverse)
        {
            System.out.println(number+" is a palindrome");
        }
        else {
            System.out.println(number+" is not a palindrome");
        }
    }
}
