import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Map<String, Integer> xmap = new HashMap<String, Integer>();
        int n=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++) 
        {
            String name=sc.nextLine();
            int phone=sc.nextInt();
            xmap.put(name,phone);
            sc.nextLine();
        }
        while (sc.hasNext()) 
        {
            String s=sc.nextLine();
            if (xmap.containsKey(s)) 
            {
                System.out.println(s + "=" + xmap.get(s));
            }
            else 
            {
                System.out.println("Not found");
            }
        }
        sc.close();
    }
}
