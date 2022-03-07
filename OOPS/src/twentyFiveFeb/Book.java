package twentyFiveFeb;

public class Book {
	private String title;
	private Member mbr;

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	public void status() {
		if(mbr == null) {
			System.out.println(title+ " is not issued by any member");
		}
		else {
			System.out.println(title+ " is issued by "+ mbr.getName());

		}
	}
	public void issueBook(Member m) {
		Book b = new Book(title);
		
		m.setBook(b);
	}
	public void returnBook(Member m) {
		m.setBook(null);
	}
	
}
