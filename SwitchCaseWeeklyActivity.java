import java.util.Scanner;

public class WeeklyActivity{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the string: ");
        String day = scanner.nextLine().trim();

        
        
        String activity;
        switch( day)
        {
            case "Monday":
                activity = "Yoga";
                break;
                
            case "Tuesday":
                activity = "Jogging";
                break;
                
            case "Wednesday":
                activity = "Walking";
                break;
                
            case "Thursday":
                activity = "Dancing";
                break;
                
            case "Friday":
                activity = "Pilates";
                break;
                 
            case "Saturday":
                activity = "Cricket";
                break;
                
            case "Sunday":
                activity = "Movie";
                break;
            
            default:
                activity = "cooking";
                break;
                
            }
            
            System.out.println("The activity performed on that day is: " + activity);
            scanner.close();
            }
    
}
        