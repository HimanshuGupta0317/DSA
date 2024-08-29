import java.util.*;
public class text2 {

    
    public static int findSecondLargest(int[][] arr) 
    {
        if (arr == null || arr.length == 0) 
        {
            System.out.println("Array is empty");
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int[] row : arr) {
            for (int num : row) {
                if (num > max) 
                {
                    secondMax = max;
                    max = num;
                } 
                else if (num > secondMax && num < max) 
                {
                    secondMax = num;
                }
            }
        }
        return secondMax;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns:");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter the elements of an array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Element at [%d][%d]:", i, j);
                arr[i][j] = sc.nextInt();
            }
        }

        int ans = findSecondLargest(arr);
        if (ans != Integer.MIN_VALUE) 
        {
            System.out.println("The second largest element is:"+ans);
        } 
        else 
        {
            System.out.println("Second element not found.");
        }
    }

}







// import java.util.Scanner;

// public class ArrayInputExample {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input dimensions
//         System.out.print("Enter the number of rows: ");
//         int rows = scanner.nextInt();
//         System.out.print("Enter the number of columns: ");
//         int cols = scanner.nextInt();

//         // Create the 2D array
//         int[][] array = new int[rows][cols];

//         // Input array elements
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.printf("Element at [%d][%d]: ", i, j);
//                 array[i][j] = scanner.nextInt();
//             }
//         }

//         // Display the array
//         System.out.println("The entered 2D array is:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print(array[i][j] + " ");
//             }
//             System.out.println();
//         }

//         scanner.close();
//     }
// }



// public class SecondLargestIn2DArray {

//     public static void main(String[] args) {
//         int[][] array = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         int result = findSecondLargest(array);
//         if (result != Integer.MIN_VALUE) {
//             System.out.println("The second largest element is: " + result);
//         } else {
//             System.out.println("There is no second largest element.");
//         }
//     }

//     public static int findSecondLargest(int[][] array) {
//         if (array == null || array.length == 0) {
//             throw new IllegalArgumentException("Array cannot be null or empty.");
//         }

//         int max = Integer.MIN_VALUE;
//         int secondMax = Integer.MIN_VALUE;

//         for (int[] row : array) {
//             for (int num : row) {
//                 if (num > max) {
//                     secondMax = max;
//                     max = num;
//                 } else if (num > secondMax && num < max) {
//                     secondMax = num;
//                 }
//             }
//         }

//         return secondMax;
//     }
// }




