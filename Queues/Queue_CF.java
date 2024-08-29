import java.util.*;
public class Queue_CF 
{

    public static void main(String[] args) 
    {
        // Queue <Integer> q1 = new LinkedList<>();
        Queue <Integer> q1 = new ArrayDeque<>();

        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);

        while (!q1.isEmpty()) 
        {
            System.out.println(q1.poll()); // sysout(q1.peek()) or q1.remove() or q1.poll()
        }
    }
    
}
