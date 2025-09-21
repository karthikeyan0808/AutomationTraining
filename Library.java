package homeAssignment.Week2;

import freemarker.core.ReturnInstruction.Return;

public class Library {
	
	
	public void addBook(String bookTitle) {
		
		String newBook = "Wings of Fire";
		
		System.out.println("Booked added successfully");
		
		return;
	}
	
	public void issueBook() {
		
		System.out.println("Booked issued successfully");
	}
	
	 
	
	public static void main(String[] args) {
		
		Library libDetails = new Library();
		
		libDetails.addBook(null);
		
		libDetails.issueBook();
		
		
	}

}
