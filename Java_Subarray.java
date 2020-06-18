import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];        
        for (int i=0;i<size;i++) 
        {
            array[i] = sc.nextInt();
        }


        int count=0;
        for (int i=0;i<array.length;i++) 
        {
            int sum=0;
            for (int j=i;j<array.length; j++) 
            {
                sum +=array[j];
                if (sum<0) 
                {
                    count++;
                }
            }
        }       
        System.out.println(count);
    }
    
}
