import java.util.Scanner;

class SubstringOccurrences {
    public static int countOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;
        
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); // Move index forward
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter the main string: ");
        String str = scn.nextLine();
        
        System.out.print("Enter the substring to find: ");
        String sub = scn.nextLine();
        
        // Count occurrences
        int occurrences = countOccurrences(str, sub);
        
        // Display result
        System.out.println("The substring '" + sub + "' appears " + occurrences + " times in the given string.");
        
        
    }
}
