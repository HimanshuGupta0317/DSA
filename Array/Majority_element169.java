

package Array;

import java.util.Scanner;

/**
 * Majority_element169
 */
public class Majority_element169 {

    public static int majorityElement(int[] nums) {
        int n=nums.length;
        for( int i=0;i<n;i++)
        {
            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                count++;
            }
            if(count>=nums.length/2)
            return nums[i];
        }
        return -1;
        
    }

    public static void main(String[] args) {
         Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter array element");
        for(int i = 0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }

       System.out.println(majorityElement(nums));
    }
}

