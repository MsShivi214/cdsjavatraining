public class whileloop{
    public static void main(String[] args) {
        int i = 10;
        int sum = 0;
        do
        {
            System.out.println(i);
            sum += i;
            i--;
            
            
        }
        while(i>=1);
        System.out.println(sum);
        
        if(sum%2 == 0)
        {
            System.out.println("sum is Even");
        }
        else{
            System.out.println("Sum is Odd");
        }
    }
}