package Array;

import java.util.Scanner;

public class Right_rotatearray {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        // -----------------------------> Right rotate array

        // int temp = arr[n-1];
        // for (int i=n-1; i>=1; i--) {
        //     arr[i] = arr[i-1];
        // }
        
        // arr[0] = temp;
        
        // System.out.println("Right Rotate array is: ");

        // for (int i = 0; i<n; i++) {
        //     System.out.print(arr[i]+" ");
        // }



        // -----------------------------> K times right rotate array

        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        k %= n;

        for(int j=0;j<k;j++)
        {
            int temp = arr[n-1];
            for (int i=n-1; i>=1; i--) {
                arr[i] = arr[i-1];
            }
            
            arr[0] = temp;
            
        }
        System.out.println("Right Rotate array is: ");
        for (int i = 0; i<n; i++) 
        {
            System.out.print(arr[i]+" ");
        }

    }
    
}
