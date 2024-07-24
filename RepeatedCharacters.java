import java.util.Scanner;

public class RepeatedCharacters
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        
        findRepeatedCharacters(str);
        
        scanner.close();
    }
    
    
    public static void findRepeatedCharacters(String str)
     {
        
        char[] chars = str.toCharArray();
        
        System.out.println("Repeated characters and theit count:");
        
        
        
        for (int i = 0; i < chars.length; i++) 
        {
            char currentChar = chars[i];
            int count = 0;
            
            
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {

                if (chars[k] == currentChar) {
                    alreadyCounted = true;
                    break;
                }
            }
            
            
            if (!alreadyCounted) 
            {
                for (int j = 0; j < chars.length; j++)
                 {
                    if (chars[j] == currentChar) 
                    {
                        count++;
                    }
                }
                
                
                if (count > 1) 
                {
                    System.out.println(currentChar + ":" + count);
                    
                }
            }
        }
    }
}
