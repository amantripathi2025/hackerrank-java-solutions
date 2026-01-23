import java.io.*;
import java.util.*;

public class string2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the string
        String s = scanner.nextLine();
        
        // Read the start and end indices
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        
        // Print the substring from start to end (exclusive of end index)
        System.out.println(s.substring(start, end));
        
        scanner.close();
    }
}