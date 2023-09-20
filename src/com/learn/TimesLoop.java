package com.learn;



public class TimesLoop {

    public static void main(String[] args) {
        System.out.println("12 midnight");
        for(int i=1;i<24;i++)
        {
            if(i <12)
            {
                System.out.println(i+" am");
            }
            else if(i==12)
            {
                System.out.println("12 noon");
            }
            else
            {
                System.out.println(i-12+" pm");
            }



        }

    }
}
