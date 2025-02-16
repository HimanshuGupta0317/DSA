package Tree;

import java.util.Scanner;

public class Heapsort {
    public static void main(String[] args) {
        // int[] arr = {6,2,1,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
        
    }
    public static void sort (int[] arr)
    {
        int n = arr.length;
        for(int i = n/2-1; i>=0;i--)
        {
            heapify(arr,n,i);
        }

        for(int i = n-1;i>0;i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }
    }

    static void heapify(int[] arr, int n, int i)
    {
        int element = i; // root node
        int left = 2*i+1; // left child
        int right = 2*i+2;// right child

        if(left<n && arr[left] > arr[element])
        {
            element = left;
        }
        if(right<n && arr[right] > arr[element])
        {
            element = right;
        }
        if(element != i)
        {
            int temp = arr[element];
            arr[element] = arr[i];
            arr[i] = temp;
            heapify(arr, n, element);
        }

    }
    
}
