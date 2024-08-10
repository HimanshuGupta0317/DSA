package String;

import java.util.Arrays;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        // // ================== count negative sub array
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     arr[i] = sc.nextInt();
        // }
        // int count=0,ans=0;
        // for(int i=0;i<n;i++)
        // {
            
        //     for(int j=i;j<n;j++)
        //     {
        //         int sum = 0;
        //         for (int k=i;k<=j;k++)
        //         {
        //             sum += arr[k];
                    
        //         }
        //         if(sum<ans)
        //             count++;
        //     }
            
        // }
        // System.out.println(count);


// Given five positive integers, find the minimum and maximum values that
//  can be calculated by summing exactly four of the five integers. Then 
//  print the respective minimum and maximum values as a single line of two 
//  space-separated long integers.


         Scanner sc = new Scanner (System.in);
        // int n = sc.nextInt();
        int arr[] = new int[5];
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        long min_sum = 0;
        long max_sum = 0;
        Arrays.sort(arr);
        
        for(int i=0;i<n;i++)
        {
            
            min_sum += arr[i]; 
            max_sum +=arr[i];
        }
        long maxsum = min_sum-arr[0];
        long minsum = max_sum-arr[4];
        
        System.out.print(minsum+" "+maxsum);




    }
    
}
