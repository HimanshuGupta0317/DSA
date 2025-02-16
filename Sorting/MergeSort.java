package Sorting;

import java.util.Scanner;

/**
 * MergeSort
 */
public class MergeSort 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        MSort(arr,0,n-1);
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }

    public static void MSort(int[] arr,int s,int e)
    {
        if(s>=e) return;
        int mid = s+(e-s)/2;
        MSort(arr, s, mid);
        MSort(arr,mid+1, e);
        merge(arr, s, mid, e);
    }

    public static void merge(int [] arr,int s,int mid,int e)
    {
        int left = mid-s+1;
        int right = e-mid;

        int[] L = new int[left];
        int[] R = new int[right];

        for(int i=0;i<left;i++)
        {
            L[i] = arr[s+i];
        }

        for(int i=0;i<right;i++)
        {
            R[i] = arr[mid+1+i];
        }
        
        int i=0,j=0,k=s;
        while(i<left && j<right)
        {
            if(L[i]<R[j])
            {
                arr[k++] = L[i++];
            }
            else
            {
                arr[k++] = R[j++];
            }
        }
        while(i<left)
        {
            arr[k++]=L[i++];
        }
        while(j<right)
        {
            arr[k++] =R[j++];
        }
    }
}