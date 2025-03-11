import java.util.Scanner;

class UniqueCharactersFinder {
    public static int[] alphabets = new int[26];

    // Frequency of each character
    public static void checkFrequency(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            else{
                int typeCast = str.charAt(i)-'a';
                alphabets[typeCast] +=1;
            }
        }
    }

    // Get Unique Characters from alphabets array
    public static void getUniqueCharacters(){
        for(int i=0;i<alphabets.length;i++){
            if(alphabets[i]==1){
                char ch = (char) (i + 'a'); 
                System.out.print(ch+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = scn.nextLine().toLowerCase();

        checkFrequency(str);
        getUniqueCharacters();

    }
}

// Sample Case
// Enter the String: Hello How are you
// a r u w y
