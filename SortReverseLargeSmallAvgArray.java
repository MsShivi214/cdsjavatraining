import java.util.Arrays;

public class ArrayStats 
{
    public static void main(String[] args) 
    {
        int[] array = {1, 7, 3, 11, 24, 9};
        // Sorting the array
        Arrays.sort(array);
        
        // Printing the sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));
        
        // Reversing the array
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        
        // Printing the reversed array
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    

        int greatest = array[0];
        int smallest = array[0];
        int sum = 0;

        for (int number : array) {
            if (number > greatest) {
                greatest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
            sum += number;
        }

        double average = (double) sum / array.length;

        System.out.println("Greatest number: " + greatest);
        System.out.println("Smallest number: " + smallest);
        System.out.println("Average sum: " + average);
    }
}

