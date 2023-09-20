package com.learn;

public class Springseason {
    public static void main(String[] args)
    {
        int m=Integer.parseInt(args[0]);
        int d=Integer.parseInt(args[1]);

        if(m==3 && d>20 && d<=31)
        {

            System.out.println("True");
        } else if (m==6 && d< 20 && d>0) {
            System.out.println("True");

        }
        else if(m>3 && m<6 && d>0 && d<=31)
        {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
