package Array;
import java.util.Scanner;

public class Linear_search {

    static int linear(int arr[],int n, int se)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==se)
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter search element: ");
        int se = sc.nextInt();

        System.out.println(linear(arr, n, se));

    }
}
