import java.util.Scanner;

class LengthOfString{
	
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str=scn.next();
		System.out.println("Length of string using built in method is: "+str.length());
		System.out.println("Length of string without using built in method is: "+findLength(str));
	}

	public static int findLength(String s){
		int count=0;
		try{
			while(true){
				s.charAt(count);
				count++;
			}
		}
		catch(IndexOutOfBoundsException e){
			//System.out.println("Index Out Of Bounds Exception");
		}
		return count;
	}
}

/*
Enter a string: asdfjkl;
Length of string using built in method is: 8
Length of string without using built in method is: 8
*/