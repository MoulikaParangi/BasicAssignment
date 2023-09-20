package com.learn;

public class AreaOfTriangle {
    public static void main(String[] args)
    {
        double a=Double.parseDouble(args[0]);
        double b=Double.parseDouble(args[1]);
        double c= Double.parseDouble(args[2]);
        double s= (a+b+c)/2;
        double product= s*(s-a)*(s-b)*(s-c);
        double Area= Math.sqrt(product);
        System.out.println(Area);
    }
}
