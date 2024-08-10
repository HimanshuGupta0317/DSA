package Array;
import java.util.*;

public class Hash_map {
        
        public static void main(String[] args) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(26,3);
        map.put(7,4);
        System.out.println(map);
        map.put(7,8);      // update the count of 7 because map function does not store duplicate value
        System.out.println(map);
        System.out.println(map.size());  // find the size of map
        System.out.println(map.get(7));     // give the value of 7
        map.remove(26);      //remove the 26 key
        System.out.println(map);
        System.out.println(map.get(26));    // not present so give null
        System.out.println(map.containsKey(26));    // check the key is present or not

        // traversal of hash map
        map.put(2,3);
        map.put(3,7);
        map.put(-1,9);

    }
    
}
