import java.util.Scanner;
public class HollowDiamondPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrintDiamondPattern(n);
        sc.close();
    }
    public static void PrintDiamondPattern(int n){
       for(int i=1;i<=n;i++){
        for(int space=1;space<=n-i;space++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
          if(j==1|| j==2*i-1)
           System.out.print("*"+" ");
          else
           System.out.print(" ");
        }
        System.out.println();
       }
         for(int i=n-1;i>=1;i--){
          for(int space=1;space<=n-i;space++){
                System.out.print(" ");
          }
          for(int j=2*i-1;j>=1;j--){
                if(j==1|| j==2*i-1)
                System.out.print("*"+" ");
                else
                System.out.print(" ");
          }
          System.out.println();
         }
    }
}