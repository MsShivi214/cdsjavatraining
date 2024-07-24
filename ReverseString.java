import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a word to reverse: ");
        String str = scanner.nextLine();
        
        String reversedStr = reverseString(str);
        
        
        System.out.println("Original word: " + str);
        System.out.println("Reversed word: " + reversedStr);
        
        scanner.close();
    }
    
    
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); 
            reversed = ch + reversed;  
        }
        return reversed;
    }
}
