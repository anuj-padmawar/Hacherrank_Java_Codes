import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> list =new LinkedList();
        for (int i=0;i<n;i++) 
        {
            int value=sc.nextInt();
            list.add(value);
        }
        

        int q=sc.nextInt();
        for (int i=0;i<q;i++) 
        {
            String action=sc.next();
            if (action.equals("Insert")) 
            {
                int index=sc.nextInt();
                int value=sc.nextInt();
                list.add(index,value);
            } 
            else 
            { 
                int index=sc.nextInt();
                list.remove(index);
            }
        }
        
        for (Integer num : list) 
        {
            System.out.print(num + " ");
        }
    }
}
