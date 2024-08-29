package Array;

import java.util.*;

public class Left_rotatearray {

    static void rotate(int[] arr, int k) {
        int n = arr.length; // for finding length of an array
        k %= n; // n times rotate krne k baad array same aayega to use "k" k range me layenge
        reverse(arr, 0, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, k, n - 1);

    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();

        rotate(arr, a);

        // =============----------------> left rotate array

        // int temp = arr[0];
        // for (int i = 0; i < n - 1; i++) {
        // arr[i] = arr[i + 1];
        // }
        // arr[n - 1] = temp;
        // System.out.println("Left Rotate array is: ");

        // for (int i = 0; i < n; i++) {
        // System.out.print(arr[i]);
        // }

        // ------------------------------ K times left rotate array

        // System.out.println("Enter the value of k:");
        // int k = sc.nextInt();
        // k %= n;
        // for(int j=0;j<k;j++)
        // {

        // int temp = arr[0];
        // for (int i = 0; i < n - 1; i++) {
        // arr[i] = arr[i + 1];
        // }
        // arr[n - 1] = temp;
        // }
        // System.out.println("k times Left Rotate array is: ");
        // for (int i = 0; i < n; i++)
        // {
        // System.out.print(arr[i]);
        // }

    }
}
