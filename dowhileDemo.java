public class whileloop{
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do
        {
            System.out.println(i);
            sum += i;
            i++;
            sum += i;
            
        }
        while(i<=10);
        System.out.println(sum);
    }
}
