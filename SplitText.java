import java.util.Arrays;
import java.util.Scanner;

class SplitText {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.nextLine();

        String words[] = str.split(" ");

        System.out.println("Words using split method: ");
        for(int i=0;i<words.length;i++){
        System.out.print(words[i]+" ") ;
        }

        int stringWordsCount = countWords(str);

        System.out.println("\nNumber of words in string: " + stringWordsCount);
        String splitWords[] = stringSplitMethod(stringWordsCount, str);
        for (int i = 0; i < stringWordsCount; i++) {
            System.out.print(splitWords[i] + " ");
        }

        System.out.println("\nBoth Array are Equal? : " + Arrays.equals(words,splitWords));
    }

    public static String[] stringSplitMethod(int wordsCount, String str) {
        String[] split = new String[wordsCount];
        String newStr = "";
        int sIx = 0, wordIndex = 0;

        while (sIx < str.length()) {
            if (str.charAt(sIx) == ' ') {
                split[wordIndex] = newStr;
                wordIndex++;
                newStr = "";
            } else {
                newStr += str.charAt(sIx);
            }
            sIx++;
        }

        // Add the last word
        if (!newStr.isEmpty()) {
            split[wordIndex] = newStr;
        }

        return split;
    }

    public static int countWords(String str) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        return count;
    }

}

/*
Enter the string: Hello everyone, How you all are doing?

Words using split method:
Hello everyone, How you all are doing?

Number of words in string: 7

Hello everyone, How you all are doing?

Both Array are Equal? : true

*/


