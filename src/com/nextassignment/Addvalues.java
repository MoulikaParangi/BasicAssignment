package com.nextassignment;

public class Addvalues {
    public static void main(String[] args)
    {
        int number=Integer.parseInt(args[0]);

        int sum=0;
        while(number>0)
        {

            int rem=number%10;
            number=number/10;
            sum=sum+rem;
        }
        System.out.println(sum);
    }
}
