package com.learn;

public class Hurricane {
    public static void main(String[] args) {
        int windSpeed = Integer.parseInt(args[0]);
        if (windSpeed <74)
        {
            System.out.println("Not A Hurricane");
        }
        else if (windSpeed >=74 && windSpeed<=95)
        {
            System.out.println("Class 1 ");
        }
        else if (windSpeed >=96 && windSpeed<=110)
        {
            System.out.println("Class 2 ");
        }
        else if (windSpeed >=111 && windSpeed<=130)
        {
            System.out.println("Class 3 ");
        }
        else if (windSpeed >=131 && windSpeed<=155)
        {
            System.out.println("Class 4 ");
        }
        else {
            System.out.println("Class 5");
        }
    }
}
