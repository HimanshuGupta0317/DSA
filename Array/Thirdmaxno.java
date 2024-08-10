package Array;
/**
 * Thirdmaxno
 */
import java.util.Scanner;
public class Thirdmaxno {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element");
        for(int i = 0; i<size; i++)
        {
            arr[i] = sc.nextInt();

        }
        // int ans = 0;
        int first_max = Integer.MIN_VALUE;
        for(int i = 0; i<size;i++)
        {
            if(arr[i]>first_max)
            first_max = arr[i];
        }
        System.out.println("First max number is:- "+first_max);


        int second_max = Integer.MIN_VALUE;
        for(int i=0;i<size;i++)
        {
            if(arr[i]>second_max && arr[i]!=first_max)
                second_max=arr[i];
        }
        System.out.println("Second Max number is:- "+second_max);

    }

}