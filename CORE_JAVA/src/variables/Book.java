package variables;

public class Book {
	public static String libraryName="City Public Library";
	String title;
	String author;
	
	
	public void displayInfo() {
		System.out.println("Library Name :" +libraryName);
		System.out.println("Book Title :" +title);
		System.out.println("Book Author :" +author);
		System.out.println("-------------------------");
		
	}
		
	public static void main(String[] args) {
		Book obj1=new Book();
		Book obj2=new Book();
		obj1.title="The Great Gatsby";
		obj1.author="F.Scottt Fitzgerald";
		
		obj1.displayInfo();
		
		obj2.title="1984";
		obj2.author="George Orwell";
		
		obj2.displayInfo();	
		
	}
	
}
    