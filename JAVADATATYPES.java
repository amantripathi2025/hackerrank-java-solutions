
    import java.io.*;
import java.util.*;

public class JAVADATATYPES  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < t; i++) {
            String numStr = scanner.nextLine().trim();
            
            try {
                long num = Long.parseLong(numStr);
                System.out.println(numStr + " can be fitted in:");
                
                // Check byte
                if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                
                // Check short
                if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                
                // Check int
                if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                
                // Always fits in long since we parsed it as long
                System.out.println("* long");
                
            } catch (NumberFormatException e) {
                // Number doesn't fit in long
                System.out.println(numStr + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}

