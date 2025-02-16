package String;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Most_occuring_character
 */
public class Most_occuring_character 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = sc.nextLine();
        char mostOccurringChar = mostOccurring(str);
        System.out.println("Most Occuring Character is: ");
        System.out.print(mostOccurringChar);
    }

    public static char mostOccurring(String str) 
    {
        
        Map<Character, Integer> charFrequency = new HashMap<>();
        str = str.toLowerCase();

        
        for (char c : str.toCharArray())
        {
            
            if (charFrequency.containsKey(c))
            {
                charFrequency.put(c, charFrequency.get(c) + 1);
            } 
            
            else 
            {
                charFrequency.put(c, 1);
            }
        }


        char mostOccurringChar = ' ';
        int max_count = 0;
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) 
        {
            if (entry.getValue() > max_count) 
            {
                max_count = entry.getValue();
                mostOccurringChar = entry.getKey();
            }
        }

        return mostOccurringChar;
    }
}