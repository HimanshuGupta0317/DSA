import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(5);
        li.add(8);
        li.add(7);
        li.add(1,3);
        li.add(2,6);
        li.get(2);
        System.out.println(li);
        for(int i=0;i<li.size();i++)
        {
            System.out.println(li.get(i));
        }

    }
}
