import java.util.Random;
public class Ex3Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int largest = Integer.MIN_VALUE; // Initialize with the smallest possible integer
        int smallest = Integer.MAX_VALUE; // Initialize with the largest possible integer

        while (count < 10) {
            int randomNumber = random.nextInt(100) + 1; // Generate a random integer between 1 and 100
            System.out.println("Generated number: " + randomNumber);

            // Check for the largest number
            if (randomNumber > largest) {
                largest = randomNumber;
            }

            // Check for the smallest number
            if (randomNumber < smallest) {
                smallest = randomNumber;
            }

            count++;
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
    }

