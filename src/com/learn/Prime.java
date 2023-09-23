package com.learn;

public class Prime {
    public static void main(String[] args)
    {
        boolean flag=true;
        int mydata[]={9,15,18,35,21,98,67,86};
        for(int i=0;i<mydata.length;i++)
        {
            flag=true;
            for(int j=2;j<mydata[i]/2;j++)
            {
                if(mydata[i]%j==0)
                {
                    flag=false;
                }
            }
            if(flag)
            {
                System.out.println(mydata[i]);
            }
        }
    }
}
