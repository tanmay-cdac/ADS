public class Problem02{
    public static boolean isPrime(int num, int divisor) {
        if(num<=2){
			return false;
		}
		if(num%2==0){
			return false;
		}
		if(divisor*divisor>num){
			return true;
		}
		return isPrime(num, divisor+1);
    }

    public static void main(String[] args) {
        int num = 5;
		System.out.println(isPrime(num, 2));
    }
}



/*
public class PrimeNumber{
    public static boolean isPrime(int num) {
        if(num<=1){
			return false;
		}
		for(int i=2; i*i<=num; i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
    }

    public static void main(String[] args) {
        int num = 5;
		System.out.println(isPrime(num));
    }
}
*/