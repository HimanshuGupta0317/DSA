import java.util.*;

public class text3 
{

    static void rotate(int[][] matrix) 
    {
        if (matrix == null || matrix.length == 0) 
        {
            System.out.println("Matrix is empty");
        }

        
        for (int i=0;i<matrix.length;i++) 
        {
            for (int j=i;j<matrix[0].length;j++) 
            {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
            
        }
        for (int i=0;i<matrix.length/2;i++) 
        {
            for (int j=0;j<matrix.length;j++) 
            {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns:");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter the elements of the array:");
        for (int i=0;i<r; i++) 
        {
            for (int j=0;j<c;j++) 
            {
                System.out.printf("Enter element at [%d][%d]:",i,j);
                arr[i][j] = sc.nextInt();
            }
        }

        rotate(arr);
        System.out.println("Rotated matrix:");

            for (int i=0;i<arr.length;i++) 
            {
                for (int j=0;j<arr.length;j++) 
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
    }
}

