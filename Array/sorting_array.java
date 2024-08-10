package Array;
import java.util.Scanner;

// ----------------> array sort or not checking

public class sorting_array {

    static boolean is_sort_array(int arr[],int n)
    {
        // ----------------------------first approach
        // for(int i=0;i<n-1;i++)
        // if(arr[i]>arr[i+1])
        // {
        //     return false;
        // }
        // return true;


        // --------------------- second approach

        for(int i=1;i<n;i++)
        if(arr[i]<arr[i-1])
        {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(is_sort_array(arr, n));

    }
}


// -----------------> reverse array

// public class sorting_array {


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of an array:");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter array element");
//         for(int i=0;i<n;i++)
//         {
//             arr[i] = sc.nextInt();
//         }
        
        // ------------- first approach 
        // for(int i=0;i<n/2;i++)
        // {
        //     int temp = arr[i];
        //     arr[i] = arr[n-1-i];
        //     arr[n-1-i] = temp;
        // }
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println(arr[i]);
        // }

        // -------------------> second approach two pointer
//         int start=0,end=n-1;
//         while(start<end)
//         {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//         System.out.println("Reverse array is: ");
//         for(int i=0;i<n;i++)
//         {
//             System.out.println(arr[i]);
//         }

//     }
// }
