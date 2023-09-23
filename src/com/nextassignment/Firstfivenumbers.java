package com.nextassignment;

public class Firstfivenumbers {
    public static void main(String[] args)
    {
        int count=0;

        for(int i=2;i<400;i++)
        {
            if(i%2==0 && i%3==0 && i%5==0)
               {
                   System.out.println(i);
                   count++;
               }
            if(count==5)
            {
                break;
           }
        }

    }
}
