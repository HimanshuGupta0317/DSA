package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_entry {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(12, 6);
        // map.put(18, 3);
        // map.put(10, 5);
        // map.put(19, 4);

        // input of hashmap by array

        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int value = map.get(arr[i]);
                map.put(arr[i], value+1);
            }
            else
            map.put(arr[i], 1);
        }
        System.out.println(map);

        // traverse of an hash map by map entry
        // for(Map.Entry<Integer,Integer> e : map.entrySet())
        // {
        // System.out.println(e.getKey());
        // System.out.println(e.getValue());
        // }

        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> e: map.entrySet())
        {
            max = Math.max(max, e.getValue());
        }

        for(Map.Entry<Integer, Integer> e: map.entrySet())
        {
           if(e.getValue()==max)
           System.out.println("maximum value of key is:--->"+e.getKey());
        }

    }

}
