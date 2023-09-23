package com.nextassignment;

public class Interest {
    public static void main(String[] args)
    {
        String gender= args[0];
        int age=Integer.parseInt(args[1]);
        double interest;

        if(gender=="female" && age >=1 && age <=58)
        {
            interest=8.2;
            System.out.println(interest+"%");
        }
        else if(gender=="female" && age >=59 && age <=120)
        {
            interest=7.6;
            System.out.println(interest+"%");
        }
        else if(gender=="male" && age >=1 && age<=60)
        {
            interest=9.2;
            System.out.println(interest+"%");
        }
        else{
            interest=8.3;
            System.out.println(interest+"%");
        }
    }
}
