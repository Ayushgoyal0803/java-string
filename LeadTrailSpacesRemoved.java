import java.util.Scanner;

class LeadTrailSpacesRemoved {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scn.nextLine();  

        // Getting start and end index after trimming spaces
        int[] trimIndexes = trimSpaces(input);
        int start = trimIndexes[0];
        int end = trimIndexes[1];

        // Creating substring using charAt() method
        String trimmedUsingMethod = createSubstring(input, start, end + 1);

        // Using built-in trim() method
        String trimmedUsingBuiltIn = input.trim();

        // Comparing both results
        boolean areEqual = compare(trimmedUsingMethod, trimmedUsingBuiltIn);

        // Displaying results
        System.out.println("\nTrimmed using custom method: '" + trimmedUsingMethod + "'");
        System.out.println("Trimmed using built-in method: '" + trimmedUsingBuiltIn + "'");
        System.out.println("Are both equal? " + areEqual);
    }

    // Method to find the start and end index after trimming spaces
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to extract substring using charAt() method
    public static String createSubstring(String s, int start, int end) {
        if (start < 0 || end > s.length() || start >= end) {
            return "Invalid";
        }

        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
/*

Enter the string:         syj yjn jjkj

Trimmed using custom method: 'syj yjn jjkj'
Trimmed using built-in method: 'syj yjn jjkj'
Are both equal? true

*/