public class Problem05{

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 17, b = 13;
        System.out.println(gcd(a, b));
    }
}


/*
public class GCD{
    public static int gcd(int a, int b) {
		int big = a>b?b:a;
		int max =0;
		for(int i=1; i<=big; i++){
			if(a%i==0 && b%i==0){
				max =i;
			}
		}
		return max;
    }

    public static void main(String[] args) {
        int a = 17, b = 13;
		System.out.println(gcd(a,b));
    }
}
*/