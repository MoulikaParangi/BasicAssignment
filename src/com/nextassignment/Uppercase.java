package com.nextassignment;

public class Uppercase {
    public static void main(String[] args)
    {
        char ch = 'M';
        char ch1;
        int value= (int) ch;
       if(value >=97 && value <=122)
       {
           ch1=Character.toUpperCase(ch);
           System.out.println(ch+"->" +ch1);
       }
       else {
           ch1=Character.toLowerCase(ch);
           System.out.println(ch+"->" +ch1);
       }

    }

}
