package p1;
public class Stock implements Exchange {
	
	@Override
	public void viewQuote() {
		System.out.println("view quote");
	}
	@Override
	public void getQuote() {
		System.out.println("get Quote");

	}

	@Override
	public void setQuote() {
		System.out.println("set Quote");

	}

}
