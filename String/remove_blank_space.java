package String;

import java.util.Scanner;

public class remove_blank_space {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:- ");
        String str = sc.nextLine();

        // =====------------------------------>
        // write a program to  remove all blank space from string

        // String str1 = str.replaceAll("\\s", "");
        // System.out.println(str+"--->");
        // System.out.println("After removing blank space:- "+str1);

        // ===========================================------->
        // remove duplicate character from string

        // StringBuilder sb = new StringBuilder();
        // for(int i=0;i<str.length();i++)
        // {
        //     char ch = str.charAt(i);
        //     int index = str.indexOf(ch,i+1);
        //     if(index == -1)
        //     {
        //         sb.append(ch);
        //     }
        // }
        // System.out.println("after remove duplicate character:-  "+sb);


        // ====================================
        // sorting of string 
        // char[] ch = str.toCharArray();
        // for(int i=1;i<str.length();i++)
        // {
        //     for(int j=i+1;j<ch.length;j++)
        //     {
        //         if(ch[i]>ch[j])
        //         {
        //             char temp = ch[i];
        //             ch[i] = ch[j];
        //             ch[j] = temp;
        //         }
        //     }
            
        // }
        // System.out.println(new String(ch));


    String str1 = "Java";

	String str2 = new String("Java");

	System.out.println(str1 == str2);

//     str1 is a string literal, which is stored in the string constant pool. 
//     When you assign a string literal to a variable, Java checks if the string
//      already exists in the pool. If it does, the variable is assigned a reference 
//      to the existing string. If it doesn't, a new string is created and added to the pool.

// str2 is a new string object created using the new keyword. Even though the string "Java" 
// is the same as the one in the string constant pool, a new object is created and stored in the heap.


// When you compare str1 and str2 using the == operator, you are comparing the references of the 
// two objects, not their values. Since str1 and str2 are two separate objects, their references 
// are different, and the comparison returns false.

// If you want to compare the values of the strings, you should use the equals() method:







    }
    
}
