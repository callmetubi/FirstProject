import java.util.Random;
public class MinMaxArray {
    public static void main(String[] args) {
        // Create a 10-element integer array
        int[] numbers = new int[10];

        // Initialize a random number generator
        Random random = new Random();

        // Fill the array with random numbers from 1 to 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        // Initialize variables to track the smallest and largest values
        int smallest = numbers[0];
        int largest = numbers[0];

        // Find the smallest and largest elements in the array
        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
        }

        // Display the array
        System.out.println("Array values:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Display the smallest and largest elements
        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
}
