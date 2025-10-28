public class Palindrome{
    public static boolean palindromeCheck(int num){
		int n = num;
		int rev = 0;
		while(n>0){
			int digit = n%10;
			rev = rev*10 + digit;
			n = n/10; 
		}
		
		if(num == rev){
			return true;
		}
		else{
			return false;
		}
	
	}

    public static void main(String[] args) {
        int num = -121;
		System.out.println(palindromeCheck(num));
    }
}
