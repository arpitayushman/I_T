package p1;

public class TestStock {
	public static void main(String[] args) {
		Stock ril = new Stock();
		Holder h = ril;
		h.viewQuote();
		Broker b = ril;
		b.getQuote();
		b.viewQuote();
		Exchange x = ril;
		x.setQuote();
		x.viewQuote();
		x.viewQuote();
		
		System.out.println(h == b);
		System.out.println(b == x);
	}
}
