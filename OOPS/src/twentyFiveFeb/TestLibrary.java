package twentyFiveFeb;

public class TestLibrary {
	
	public static void main(String[] args) {		
		Book b1 = new Book("The Alchamist");
		Member m1 = new Member("George");
		b1.status();
		m1.status();
		
		b1.issueBook(m1);
		
		b1.status();
		m1.status();
		
		b1.returnBook(m1);
		
		b1.status();
		m1.status();
	}
}
