package Tree;

// import java.util.HashMap;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer , Integer> mp = new TreeMap<>();
        // HashMap<Integer , Integer> mp = new HashMap<>();
        mp.put(3,6);
        mp.put(1,-7);
        mp.put(8,4);
        System.out.println(mp);
    }
    
}
