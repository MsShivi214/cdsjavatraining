import java.util.Scanner;
public class SUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Enter the number:");
        for(int i = 0; i < n; i++){
            int number = sc.nextInt();
            sum += number;
            
        }
        System.err.println(sum);
        
        
    }

}
