package Stack;

import java.util.ArrayList;

public class generic_arraylist {

    public static void main(String[] args) {
        ArrayList li = new ArrayList<>();//generic class me type define nhi krte

        li.add(1);
        li.add("kanha");
        li.add(3);
        li.add(3.6);
        System.out.println(li);

        li.add(1,4.3);
        System.out.println(li);

        System.out.println(li.get(2));
        li.remove(1);
        System.out.println(li);
        System.out.println(li.size());

    }
    
}
