package com.learn;

public class PowerOfK {
    public static void main(String[] args)
    {
        int k= Integer.parseInt(args[0]);
        double power=0;
        while(power<Long.MAX_VALUE)
        {
            for(int i=0;i<10;i++)
            {
                power= Math.pow(k,i);

            }

        }


    }
}
