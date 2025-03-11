import java.util.Scanner;

class IllegalArgumentExcep {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scn.nextLine();

        // Demonstrate the exception without handling
        System.out.println("\nDemonstrating IllegalArgumentException:");
        try {
            generateException(str); // Will cause an exception
        } catch (Exception e) {
            System.out.println("Caught Exception in main: " + e.getMessage());
        }

        // Handling the exception properly
        System.out.println("\nHandling IllegalArgumentException:");
        handleException(str);
    }

    // Method to generate IllegalArgumentException
    public static void generateException(String s) {
        int startIndex = 4;
        int endIndex = 2; // Invalid: startIndex > endIndex

        // This will throw IllegalArgumentException
        System.out.println("Substring from " + startIndex + " to " + endIndex + ": " + s.substring(startIndex, endIndex));
    }

    // Method to handle IllegalArgumentException properly
    public static void handleException(String s) {
        int startIndex = 4;
        int endIndex = 2; // Invalid: startIndex > endIndex

        try {
            System.out.println("Substring from " + startIndex + " to " + endIndex + ": " + s.substring(startIndex, endIndex));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
}

/*
Enter a string: Ayush Goyal

Demonstrating IllegalArgumentException:
Caught Exception in main: Range [4, 2) out of bounds for length 11

Handling IllegalArgumentException:
RuntimeException caught: Range [4, 2) out of bounds for length 11

*/