import java.util.Scanner;

class AsciiValues{

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s = scn.next();
		String result = "";
		for(int i=0; i< s.length(); i++ ){
			int c = (int)s.charAt(i);
			result += c + "";

		}

		System.out.print("String converted to its ASCII values : " + result );

	}

}
