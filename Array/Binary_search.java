package Array;

import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of an array:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element:- ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter search element:- ");
        int key = sc.nextInt();
        int i=0,j=n-1;
        int ans=-1;

        while(i<=j) 
        {
            int mid = (i+j)/2;

            if(key==arr[mid])
            {
                ans=mid;
                break;
            }
            else if(key>arr[mid])
            {
                i=mid+1;
            }
            else 
            {
                j=mid-1;
            }

        }
        System.out.println(ans);

    }
    
}
