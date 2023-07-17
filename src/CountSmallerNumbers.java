import java.util.ArrayList;
import java.util.Scanner;

public class CountSmallerNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println(count(array,size));

    }
    public static ArrayList count(int array[],int size)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            int count = 0;
            for(int j=i+1;j<size;j++)
            {
                if(array[i]>array[j])
                {
                    count++;
                }
            }
            list.add(count);
        }
        return list;
    }

}
/*Given an integer array nums, return an integer array counts where counts[i] is the number of smaller elements to the right of nums[i].
Example 1:
Input: nums = [5,2,6,1]
Output: [2,1,1,0]
Explanation:
To the right of 5 there are 2 smaller elements (2 and 1).
To the right of 2 there is only 1 smaller element (1).
To the right of 6 there is 1 smaller element (1).
To the right of 1 there is 0 smaller element.
Example 2:
Input: nums = [-1]
Output: [0]*/
