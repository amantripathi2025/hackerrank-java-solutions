import java.io.*;
import java.util.*;

public class string7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        
        // Split the string using the specified delimiters
        // The regex "[ !,?._'@]+" means: split on one or more of these characters
        String[] tokens = s.trim().split("[ !,?._'@]+");
        
        // Handle empty string or string with only delimiters
        if (s.trim().isEmpty()) {
            System.out.println(0);
        } else {
            // Print number of tokens
            System.out.println(tokens.length);
            
            // Print each token on a new line
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
}
