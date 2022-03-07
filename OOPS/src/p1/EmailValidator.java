package p1;

public class EmailValidator {
	public static boolean checkATandDot(String str) {
		int atCount = 0, dotCount = 0;
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i) == '@')atCount++;
			if(str.charAt(i) == '.')dotCount++;
		}
		if(atCount == 1 && dotCount == 1)return true;
		return false;
	}
	public static boolean checkFourCh(String str) {
		int count = 0;
		for(int i = 0;i<str.length();i++) {
			
			if(str.charAt(i) == '@')break;
			else count++;
		}
		if(count >= 4)return true;
		return false;
	}
	public static boolean idxBetween(String str) {
		int count = str.lastIndexOf('.') - str.indexOf('@') - 1;
		
		if(count>3)return true;
		return false;
	}
	public static boolean minTwoChar(String str) {
		int count = 0;
		for(int i = str.length()-1;i>=0;i--) {
			if(str.charAt(i) == '.')break;
			else count++;
		}
		if(count>2)return true;
		return false;
		
	}
	
	public static void main(String[] args) {
		String str = "abcdddd@gmail.com";
		if(checkATandDot(str) && checkFourCh(str) && idxBetween(str) && minTwoChar(str)) {
			System.out.println("Valid Email");
		}else {
			System.out.println("Invalid Email");
		}
				
	}
}
