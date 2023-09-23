package com.nextassignment;

public class Novalues {
    public static void main(String[] args)
    {
        String s1=args[0];
        String s2=args[1];
        String s3=args[2];
        if(args.length == 0)
        {
            System.out.println("No Values");
        }
        else {
            for (int i = 0; i < args.length; i++) {
                if (i == args.length - 1) {
                    System.out.print(args[i]);
                } else {
                    System.out.print(args[i] + ", ");
                }
            }
        }
    }
}
