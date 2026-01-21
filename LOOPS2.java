import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            int term = a;
            int powerOfTwo = 1;
            
            for (int j = 0; j < n; j++) {
                term += b * powerOfTwo;
                System.out.print(term);
                powerOfTwo *= 2;
                
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}