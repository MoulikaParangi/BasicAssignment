package com.nextassignment;

public class PrimeNumbers {
    public static void main(String[] args)
    {
        boolean flag= true;
        for(int i=10;i<100;i++)
        {
            flag=true;
            for(int j=2;j<i/2;j++)
            {
               if(i%j==0)
               {
                   flag=false;
               }
            }
            if(flag)
            {
                System.out.print(i+" ");
            }
        }
    }
}
