import java.util.Scanner;

class ArrayIndexOutOfBound{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		 String[] names = {"ram","sham","dolly","priya","riya"};
		 System.out.print("Enter an index to access the array (0 to " + (names.length - 1) + "): ");
		 int index=scn.nextInt();
		 handleArrayOutOfBoundsException(names,index);
	}

	public static void generateException(String[] names,int index){
		System.out.println("Accessing element at index "+index+" : "+names[index]);
	}

	public static void handleArrayOutOfBoundsException(String[] names,int index){
		try{
			generateException(names,index);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception caught: Index " + index + " is out of bounds for the array."+e.getMessage());
		}
		catch(RuntimeException e){
			System.out.println("A runtime exception occurred: " + e.getMessage());
		}
	}
}

/*
Enter an index to access the array (0 to 4): 1
Accessing element at index 1 : sham
*/

/*
Enter an index to access the array (0 to 4): 6
Exception caught: Index 6 is out of bounds for the array.Index 6 out of bounds for length 5
*/