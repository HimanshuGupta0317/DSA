package String;

import java.util.Scanner;

public class Palindrome {

    public static boolean check(String s)
    {
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(check(s));// call method to check palindrome


        // solve krna h abhi
        // char[] arr = s.toCharArray();
        // int n=arr.length;
        // int i=0,j=n-1;
        // while(i<j)
        // {
        //     char temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        //     j--;
        // }
        // String str = arr.toString();
        // if(str.equals(s))
        // {
        //     System.out.println("String is Palindrome");
        // }
    }
    
}
