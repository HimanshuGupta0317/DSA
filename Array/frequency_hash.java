package Array;

import java.util.Scanner;

public class frequency_hash {

    // --------------> find frequency for sorted array

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the size of an array:");
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     System.out.println("Enter array element");
    //     for (int i = 0; i < n; i++) 
    //     {
    //         arr[i] = sc.nextInt();
    //     }
    //     int size = arr[n-1] + 1;
    //     int hash[] = new int[size];
    //     for(int i=0;i<n;i++)
    //     {
    //         hash[arr[i]]++;  //---> int index = arr[i]; hash[index]++;
    //     }
    //     for(int i=0;i<hash.length;i++)
    //     {
    //         System.out.println(i+"--->"+hash[i]);
    //     }
        
    // }



    // --------------> find frequency for unsorted array

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }

        int size = max + 1;
        int hash[] = new int[size];
        for(int i=0;i<n;i++)
        {
            hash[arr[i]]++;  //---> int index = arr[i]; hash[index]++;
        }
        for(int i=0;i<hash.length;i++)
        {
            System.out.println(i+"--->"+hash[i]);
        }

    }



    // --------------give an unsorted array print an element that has 

    // for same frequency print all of them

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the size of an array:");
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     System.out.println("Enter array element");
    //     for (int i = 0; i < n; i++) 
    //     {
    //         arr[i] = sc.nextInt();
    //     }
    //     int max = Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         if(arr[i]>max) // hash table ka size create krne k liye
    //         max=arr[i];
    //         // max = Math.max(max,arr[i]);
    //     }

    //     int size = max + 1;
    //     int hash[] = new int[size];
    //     for(int i=0;i<n;i++)
    //     {
    //         hash[arr[i]]++;  //---> int index = arr[i]; hash[index]++;
    //     }

    //     int max_fre = 0; // or Integer.MIN_VALUE;
    //     for(int i=0;i<hash.length;i++)
    //     {
    //         // max_fre = Math.max(max_fre, hash[i]);
    //         // or
    //         if(hash[i]>max_fre)
    //         max_fre=hash[i];
    //     }
    //     for(int i=0;i<hash.length;i++)
    //     {
    //         if(hash[i]==max_fre)
    //         {
    //         System.out.println("--->"+i);
    //         }
    //     }

    // }

    // for unique element and difference between max and min element

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the size of an array:");
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     System.out.println("Enter array element");
    //     for (int i = 0; i < n; i++) 
    //     {
    //         arr[i] = sc.nextInt();
    //     }
    //     int max = Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         if(arr[i]>max) // hash table ka size create krne k liye
    //         max=arr[i];
    //         // max = Math.max(max,arr[i]);
    //     }

    //     int size = max + 1;
    //     int hash[] = new int[size];
    //     for(int i=0;i<n;i++)
    //     {
    //         hash[arr[i]]++;  //---> int index = arr[i]; hash[index]++;
    //     }

    //     int max_fre = 0;
    //     for(int i=0;i<hash.length;i++)
    //     {
    //         // max_fre = Math.max(max_fre, hash[i]);
    //         // or
    //         if(hash[i]>max_fre)
    //         max_fre=hash[i];
    //     }
    //     int maxi =Integer.MIN_VALUE,mini=Integer.MAX_VALUE;
    //     for(int i=0;i<hash.length;i++)
    //     {
    //         if(hash[i]==max_fre)
    //         maxi = Math.max(maxi,i);

    //         if(hash[i]==1)
    //         mini = Math.min(mini,i);
    //     }
    //     System.out.println( maxi-mini);

    // }
    
}
