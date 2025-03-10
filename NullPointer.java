class NullPointer{
	public static void main(String[] args){
	    System.out.println("Demonstrating NullPointerException:");
		try{
		    generateException();
		}
		catch (Exception e) {
            System.out.println("Caught Exception in main: " + e);
		}
		
		System.out.println("\nHandling NullPointerException:");
		handleException();
    }
    
	public static void generateException(){
		String text=null;
		System.out.println("length of text is: "+text.length());
	}
	
	public static void handleException(){
		String text=null;
		try{
			System.out.println("length of text is: "+text.length());
		}
		catch(NullPointerException e){
			System.out.println("Exception caught: String is null. Cannot perform operations on null.");
		}			
	}
}

/*
Demonstrating NullPointerException:
Caught Exception in main: java.lang.NullPointerException: Cannot invoke "String.length()" because "<local0>" is null

Handling NullPointerException:
Exception caught: String is null. Cannot perform operations on null.
*/