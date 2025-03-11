import java.util.Scanner;

class FreqOfCharLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Getting frequency results
        String[] result = findFrequency(input);

        System.out.println("Character Frequencies:");
        for (String res : result) {
            if (res != null) {
                System.out.println(res);
            }
        }
    }

    public static String[] findFrequency(String str) {
        char[] chars = str.toCharArray(); // Convert string to character array
        int[] freq = new int[str.length()]; // Array to store frequency
        String[] output = new String[str.length()]; // 1D array to store character and frequency

        // Initialize frequency array with 1
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
        }

        // Finding frequency using nested loops
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue; // Skip already counted characters

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) { 
                    freq[i]++; // Increase count
                    chars[j] = '0'; // Mark duplicate characters
                }
            }
        }

        // Storing character and frequency in output array
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0' && chars[i] != ' ') { // Ignore spaces and already counted characters
                output[index++] = chars[i] + " -> " + freq[i];
            }
        }
        return output; // Return the frequency array
    }
}

/*
Example Input:
hello world

Example Output:
Character Frequencies:
h -> 1
e -> 1
l -> 3
o -> 2
w -> 1
r -> 1
d -> 1
*/
