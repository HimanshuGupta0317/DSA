package Stack;

import java.util.ArrayList;

public class stack1 {


    static class stack2
    {
        ArrayList<Integer> li = new ArrayList<>();

        public void push(int data)
        {
            li.add(data);
        }

        public int pop()
        {
            return li.remove(li.size()-1);
        }

        public int peek()
        {
            return li.get(li.size()-1);
        }


        public boolean isEmpty()
        {
            return (li.size()==0);
        }

    }

    public static void main(String[] args) {
        stack2 s = new stack2();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(5);

        System.out.println(s.pop());
        System.out.println(s.peek());

        s.push(7);
        s.push(8);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    
}
