package Recursion;

import java.util.Scanner;

public class recur {

    public static void fun(int n)
    {
        if(n==0) return;

        fun(n-1); 
        System.out.print(" -> "+n);
        fun(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        fun(n);
    }
}
