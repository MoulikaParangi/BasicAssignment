package com.learn;

public class GymnasticsScorer {
    public static void main(String[] args)
    {
        int a1=Integer.parseInt(args[0]);
        int a2=Integer.parseInt(args[1]);
        int a3=Integer.parseInt(args[2]);
        int a4=Integer.parseInt(args[3]);
        int a5=Integer.parseInt(args[4]);
        int a6=Integer.parseInt(args[5]);

        int arr[]= {a1,a2,a3,a4,a5,a6};
        int min=arr[0],max=arr[0];
        int average=0,sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
            sum=sum+arr[i];

        }
        sum=sum-(min+max);
        average=sum/4;
        System.out.println(average);


    }
}
