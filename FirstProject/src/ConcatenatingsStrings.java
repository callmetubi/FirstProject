import java.util.Scanner;
public class ConcatenatingsStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Concatenate the two strings
        String concatenatedString = firstString.concat(secondString);

        // Check if the concatenated string consists of alternating characters
        boolean isAlternating = isAlternating(concatenatedString, firstString, secondString);

        // Display the concatenated string and the result of the alternating check
        System.out.println("Concatenated String: " + concatenatedString);
        System.out.println("Is Alternating: " + isAlternating);

        scanner.close();
    }

    private static boolean isAlternating(String concatenatedString, String str1, String str2) {
        int length = concatenatedString.length();

        if (length != str1.length() + str2.length()) {
            return false; // The lengths don't match, so it can't be alternating.
        }

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                if (concatenatedString.charAt(i) != str1.charAt(i / 2)) {
                    return false;
                }
            } else {
                if (concatenatedString.charAt(i) != str2.charAt(i / 2)) {
                    return false;
                }
            }
        }

        return true;
    }
}
