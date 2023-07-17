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
