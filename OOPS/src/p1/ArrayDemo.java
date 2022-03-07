package p1;

public class ArrayDemo {
	public static void main(String[] args) {
		int jag[][] = { { 1, 2 }, { 1, 2, 3 }, { 1, 2, 3, 4 } };
		for (int i = 0; i < jag.length; i++) {
			for (int j = 0; j < jag[i].length; j++) {				
				System.out.print(jag[i][j] + " ");
			}
			System.out.println();
		}
		String str = "Sun-Mon-Tue-Wed-Thu-Fri-Sat";
		String[] res = str.split("-");
		for(String s : res) {
			System.out.println(s);


		}

		
		
	}
}
