import java.util.Scanner;

class ReplaceWord {
    public static String replaceWord(String sentence, String target, String replacement) {
        return sentence.replace(target, replacement);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String target = scanner.next();

        System.out.print("Enter the replacement word: ");
        String replacement = scanner.next();

        // Calling replace method
        String updatedSentence = replaceWord(sentence, target, replacement);

        // Output the modified sentence
        System.out.println("Updated sentence: " + updatedSentence);

        
    }
}


/*
Enter the sentence: Hello guys! How you doin
Enter the word to replace: doin
Enter the replacement word: doing
Updated sentence: Hello guys! How you doing
*/