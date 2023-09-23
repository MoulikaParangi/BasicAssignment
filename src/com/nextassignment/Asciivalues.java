package com.nextassignment;

public class Asciivalues {
    public static void main(String[] args)
    {
        char ch='$';
        int value= (int) ch;
        if((value>=97 && value<=122) || (value>=65 && value<=90))
        {
            System.out.println("Aplhabet");
        }
        else if(value>=48 && value <=57)
        {
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
    }
}
