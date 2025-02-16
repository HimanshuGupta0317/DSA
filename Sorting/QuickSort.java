package Sorting;

import java.util.Scanner;

public class QuickSort 
{
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
        QSort(arr,0,n-1);
        for(int i : arr)
        {
            System.out.println(i);
        }

    }

    public static void QSort(int[] arr,int s,int e)
    {
        if(s>=e) return;

        int pivote = Partition(arr,s,e);
        QSort(arr,s,pivote-1);
        QSort(arr,pivote+1,e);
    }
    public static int Partition(int[] arr,int s,int e)
    {
        int pivote = arr[e];
        int i=s-1;
        for(int j=s;j<e;j++)
        {
            if(arr[j]<pivote)
            {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[e];
        arr[e] = temp;

        return i;
    }
    
}
