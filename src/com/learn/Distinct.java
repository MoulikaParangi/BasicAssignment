package com.learn;

import org.jetbrains.annotations.NotNull;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Distinct {

    public static void main(String[] args)
    {

        int a= Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
       if(a!=b && a!=c && b!=c)
       {
           System.out.println(3);
       } else if ((a==b && a!=c) ||(a==c && b!=c)||(b==c && a!=b)) {
           System.out.println(2);

       }
       else {
           System.out.println(1);
       }


    }
}
