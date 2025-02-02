import java.util.Scanner;

public class BMIcalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the BMI Calculator!");

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);
        String category = categorizeBMI(bmi);

        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("You are " + category);

        scanner.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String categorizeBMI(double bmi) {
        if (bmi < 18.5) {
            return "underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "overweight";
        } else {
            return "obese";
        }
    }
}
