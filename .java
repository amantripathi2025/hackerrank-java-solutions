 
    
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    // Static variables
    static int B;
    static int H;
    static boolean flag;
    
    // Static initialization block
    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();
        
        // Check if B and H are positive
        if (B > 0 && H > 0) {
            flag = true;
        } else {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        // Only calculate and print area if flag is true
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}

