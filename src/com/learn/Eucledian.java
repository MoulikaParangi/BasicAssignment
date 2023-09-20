package com.learn;

public class Eucledian {

    public static void main(String[] args)
    {
        double x1=Double.parseDouble(args[0]);
        double x2=Double.parseDouble(args[1]);
        double y1=Double.parseDouble(args[2]);
        double y2=Double.parseDouble(args[3]);

        double diff= Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
        double distance= Math.sqrt(diff);
        System.out.println(distance);

    }
}
