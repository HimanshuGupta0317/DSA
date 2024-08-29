package Array2D;

import java.util.Scanner;

public class Matrix_Multiply {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //  for n*n
        // System.out.println("Enter the size of matrix: ");
        // int n = sc.nextInt();

        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int x = sc.nextInt();


        int[] [] A = new int[m] [n];
        int[] [] B = new int[n] [x];
        int[] [] C = new int[m] [x];
        System.out.println("Enter  the Array(matrix) element in A: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the Array(matrix) element in B: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<x;j++)
            {
                B[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int k=0;k<x;k++)
            {
                for(int j=0;j<n;j++)
                {
                    C[i][k] +=(A[i][j] * B[j][k]);
                }
            }
        }

        System.out.println("After Multiply:- ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }





    }
    
}
