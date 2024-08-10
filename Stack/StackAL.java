package Stack;

import java.util.ArrayList;

public class StackAL {

    ArrayList<Integer> list = new ArrayList<>();

    public void push(int data)
    {
        list.add(0,data);
    }

    public int peek()
    {
        if(list.size()==0)
        {
            return -1;
        }
        return list.get(0);
    }

    public int pop()
    {
        if(list.size()==0)
        {
            return -1;
        }
        return list.remove(0);
    }

    public boolean isEmpty()
    {
        return (list.size()==0);
    }


    public static void main(String[] args) {

        StackAL s = new StackAL();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    
}
