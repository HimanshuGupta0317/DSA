package Array;

import java.util.Scanner;

public class sub_array {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        //------------------------> For finding sub aarray

        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=i;j<arr.length;j++)
        //     {
        //         for(int k=i;k<=j;k++)
        //         {
        //             System.out.print(arr[k]+" ");
        //         }
        //         System.out.println();
        //     }
        //     // System.out.println();
        // }

        
        // for sum of sub arrray------------------->
        // sum += arr[k];
        // System.out.println(sum)

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum += arr[k];
                    System.out.print(arr[k]+" ");
                }
                System.out.println("->"+sum+" ");
            }
        }


        // int ans =Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++)
        // {
        //     int sum =0;
        //     for(int j=i;j<arr.length;j++)
        //     {
        //         sum += arr[j];
        //         if(sum>ans)
        //         ans=sum;
        //     }
        //     System.out.println(sum);
        // }
        // System.out.println(ans+" ");

    }

    
}
