package com.nextassignment;

public class Floyids {
    public static void main(String[] args)
    {
        int number=Integer.parseInt(args[0]);

        for(int i=0;i<number;i++)
        {
            System.out.println();
            for(int j=0;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
        }
    }
}
