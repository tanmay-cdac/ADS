public class Problem09 {
	public static boolean palindromeCheck(int num) {
		int n = num;
		int rev = 0;

		// Reverse the number
		while (n > 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}

		// Check if original equals reversed
		return num == rev;
	}

	public static void main(String[] args) {
		int num = 121;
		System.out.println(palindromeCheck(num)); // true
	}
}
