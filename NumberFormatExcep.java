import java.util.Scanner;

class NumberFormatExcep {
	
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scn.nextLine();

        handleNumberFormatException(input);
    }

    // generate NumberFormatException
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    // handling of the NumberFormatException
    public static void handleNumberFormatException(String text) {
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: Invalid number format! Please enter a valid integer.");
        } catch (RuntimeException e) {
            System.out.println("A runtime exception occurred: " + e.getMessage());
        }
    }
}

/*
Enter a number: asdf
Exception caught: Invalid number format! Please enter a valid integer.
*/

/*
Enter a number: -455
Parsed number: -455
*/