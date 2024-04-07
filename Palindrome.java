public class Palindrome {
	
	public static boolean palindromeTest(String str) {
		
		StringBuilder rev = new StringBuilder(str).reverse();
		return str.equals(rev.toString());
		}

 		// testing
public static void main(String[] args) {
	String p = "tacocat";
	if(palindromeTest(p)) {
		System.out.println(p + " is a palindrome");
	} else {
		System.out.println(p + " is not a palindrome");
	}
	}
}
