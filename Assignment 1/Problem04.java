public class Problem04 {

    static int fibonacci(int n) {
        if (n == 0) {
			return 0;
		}
        if (n == 1) {
			return 1;
		}
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int num = 5;

        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}



/*
public class FibonacciSeries{
    public static void fibonacci(int num) {
		int a=0, b=1;
		
		System.out.print(a+" "+b+" ");
		for(int i=0; i<num-2; i++){
			int fibo = a+b;
			a=b;
			b=fibo;
			System.out.print(fibo+" ");
		}
    }

    public static void main(String[] args) {
        int num = 8;
		fibonacci(num);
    }
}
*/