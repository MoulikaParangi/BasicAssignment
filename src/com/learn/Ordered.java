package com.learn;

public class Ordered {
    public static  void main(String[] args)
    {
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        int z= Integer.parseInt(args[2]);
        boolean b= true;
        int min= Math.min((Math.min(x,y)),z);
        int max=Math.max((Math.max(x,y)),z);
        if((min==x && max==z) || (max==x && min==z))
        {
            b=true;
        }
        else {
            b=false;
        }
        System.out.println(b);
    }
}
