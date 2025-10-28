public class SquareRoot{
    public static int squareRoot(int x) {
		int num = x;
		int sqrt = 0;
		for(int i=1; i<=num; i++){
			if(i*i == num){
				sqrt = i;
				break;
			}
			else if(i*i>num){
				sqrt = i-1;
				break;
			}
		}
		return sqrt;
    }

    public static void main(String[] args) {
        int x = 16;
		System.out.println(squareRoot(x));
    }
}
