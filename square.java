import java.util.Scanner;
public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printPattern(n);
        sc.close();
    }
    public static void printPattern(int n){
     for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
     }
    }
}