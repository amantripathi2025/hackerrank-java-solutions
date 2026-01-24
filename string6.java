import java.util.Scanner;

public class string6 {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        
        // Convert to lowercase for case-insensitive comparison
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        // Create frequency array for 26 letters (a-z)
        int[] freq = new int[26];
        
        // Count frequencies in first string
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i) - 'a']++;
        }
        
        // Subtract frequencies using second string
        for (int i = 0; i < b.length(); i++) {
            freq[b.charAt(i) - 'a']--;
        }
        
        // Check if all frequencies are zero
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
