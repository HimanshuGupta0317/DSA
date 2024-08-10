package Array;

import java.util.Arrays;
import java.util.Scanner;

public class smallno {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element");
        for(int i = 0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        // int small = Integer.MAX_VALUE;

        // for(int i=0;i<size;i++)
        // {
        //     if(arr[i]<small)
        //     small=arr[i];
        // }
        // System.out.println("First small no:- "+small);


        // 2nd smallest element

        // int second_s = Integer.MAX_VALUE;
        // for(int i  =0;i<size;i++)
        // {
        //     if(arr[i]<second_s && arr[i]!=small)
        //     second_s=arr[i];
        // }
        // System.out.println("second small:- "+second_s);


        // --------------------- Kth smallest number for non duplicate element

        // System.out.println("Enter kth number for fin element");
        // int kth = sc.nextInt();
        // Arrays.sort(arr);
        // System.out.println("Kth smallest element is:- "+(arr[kth-1]));



        // --------------------- Kth smallest number for duplicate element
        int small = Integer.MAX_VALUE;
        Arrays.sort(arr);
        int transition = 1;
        System.out.println("Enter kth number for find small element");
        int kth = sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(arr[i]>small)
            transition++;
            small = arr[i];
            if(kth==transition)
            System.out.println(kth+"smallest element is:- "+arr[i]);
        }




        // // --------------------- Kth largest number for non duplicate element
        // System.out.println("Enter kth number for fin element");
        // int kth = sc.nextInt();
        // Arrays.sort(arr);
        // System.out.println("Kth element is:- "+(arr[size-kth]));

        

        // --------------------- Kth largest number for duplicate element
        // int large = Integer.MAX_VALUE;
        // Arrays.sort(arr);
        // int transition = 0;
        // System.out.println("Enter kth number for find small element");
        // int kth = sc.nextInt();
        // for(int i=size-1;i>=0;i--)
        // {
        //     if(arr[i]<large)
        //     transition++;
        //     large = arr[i];
        //     if(kth==transition)
        //     System.out.println(kth+" largest element is:- "+arr[i]);
        // }
        


        

    }
    
}
