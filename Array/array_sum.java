package Array;
import java.util.Scanner;

public class array_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element: ");
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int sum = 0,product=1;

        for(int i =0;i<n;i++)
        {
            sum = sum + arr[i];
            product = product * arr[i];
        }
        System.out.println("Array of sum = "+sum);
        System.out.println("Array of product = "+product);

        
    }
}
