package Stack;

import java.util.ArrayList;

public class arraylist {
    
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();

        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        System.out.println(li);

        li.add(1,5);
        System.out.println(li);

        System.out.println(li.get(2));
        li.remove(1);
        System.out.println(li);
        System.out.println(li.size());
    }
}
