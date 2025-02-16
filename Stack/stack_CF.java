package Stack;
import java.util.*;

import Stack.stack1.stack2;

public class stack_CF 
{

    public static void main(String[] args) 
    {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(5);

        System.out.println(s.pop()+"--");
        System.out.println(s.peek()+"__");

        s.push(7);
        s.push(8);
        s.push(4);
        
        while (!s.isEmpty()) 
        {
            System.out.println(s.pop()+"--->");
        }   
    }
    
}
