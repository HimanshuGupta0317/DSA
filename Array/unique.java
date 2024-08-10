package Array;

import java.util.HashMap;
import java.util.Scanner;

public class unique {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        // print unique element in an array----------->
        // for(int i=0;i<n;i++)
        // {
        //     int count =0;
        //     for(int j=0;j<n;j++)
        //     {
        //         if(arr[i]==arr[j])
        //         {
        //             count++;
        //         }
        //     }
        //     if(count==1)
        //     {
        //         System.out.println("Unique element"+arr[i]); 
        //     }
        //      if(count>1)
        //     {
        //         System.out.println("duplicate or not unique element"+arr[i]); 
        //     }
        // }


        // find frequency----------------->
        // for(int i=0;i<n;i++)
        // {
        //     int count =0;
        //     for(int j=0;j<n;j++)
        //     {
        //         if(arr[i]==arr[j])
        //             count++;
        //     }

        // System.out.println(arr[i]+"---> "count);
        //     
        // }



    }
    
}
