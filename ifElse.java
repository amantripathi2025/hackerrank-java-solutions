 import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ifElse {
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int num1 = input.nextInt();
    if (num1 % 2 != 0) {
    System.out.println("Weird");
}
    else if (num1 >= 2 && num1 <= 5) {
    System.out.println("Not Weird");
}
else if (num1 >= 6 && num1 <= 20) {
    System.out.println("Weird");
}
else {
    System.out.println("Not Weird");
}
    }
}
 
    

