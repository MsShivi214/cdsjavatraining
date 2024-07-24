import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the student's marks: ");
        int marks = scanner.nextInt();

        
        
        String grade;
        switch( marks)
        {
            case 10:
           grade = "F";
            break;

            case 50:
            
                grade = "D";
                break;
            

            case 80:
            
                grade = "B";
                break;
            

            case 90:
                grade = "A";
                break;
            
    
            default:
            grade = "none";
            break;
                
            }
        


        
        System.out.println("The student's grade is: " + grade);

        scanner.close();
    }
}
        