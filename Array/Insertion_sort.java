package Array;

import java.util.Scanner;

public class Insertion_sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=1;i<n;i++)
        {

            int j = i-1,current=arr[i]; //small ko x kr k sir ne bataya tha
            while(j>=0 && current<arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;

        }
        System.out.println("After Insertion sort:- ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
