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




