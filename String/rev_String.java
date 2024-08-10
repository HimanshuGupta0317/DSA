package String;

import java.util.Scanner;

public class rev_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:- ");
        String str = sc.nextLine();


        // char arr[] = str.toCharArray(); 
        //  for reverse the string by reverse loop
        // for(int i=arr.length-1;i>=0;i--)
        // {
        //     System.out.print(arr[i]+" ");
        // }

        // =============================

        //  reverse string by using charAt() method
        // we can acces the index of string by charAt() method
        // for(int i=str.length()-1;i>=0;i--)
        // {
        //     System.out.print(str.charAt(i)+" ");
        // }

        // // =======================================
        // // reverse string by String Buffer
        // StringBuffer sb = new StringBuffer(str);
        // sb = sb.reverse();
        // System.out.println(str+"------->"+sb);
        // // System.out.println(str);


        // ============================================
        // reverse string by String Builder
        // StringBuilder sb = new StringBuilder(str);
        // sb = sb.reverse();
        // System.out.println(str+"------->"+sb);
        // System.out.println(str);hter from 



        // =============================================
        // write a program to remove all special charachter from String

        // String str1 = str.replaceAll("[^a-zA-Z0-9]", "");
        // System.out.println(str1);


        // ======================With DSA ==============>>>>>>>>
        // reverse string
        // String rev = "";
        // for(int i=str.length()-1;i>=0;i--)
        // {
        //     rev += str.charAt(i);
        // }
        // System.out.println(rev);


        StringBuilder rev = new StringBuilder();
        rev.append(str);
        rev.reverse();
        System.out.println(rev);

    

    }
    
}
