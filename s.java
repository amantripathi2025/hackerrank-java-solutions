 import java.util.*;
import java.security.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        
        // Convert integer to string
        String s = String.valueOf(n);
        
        // Alternative ways that also work:
        // String s = Integer.toString(n);
        // String s = "" + n;
        
        // Check if conversion was successful
        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
