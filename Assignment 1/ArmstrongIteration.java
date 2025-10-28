public class ArmstrongIteration{

	public static boolean isArmstrong(int num){
		int n = num;
		int sum = 0;
		int length = String.valueOf(n).length();
		while(n!=0){
			int digit = n%10;
			sum += Math.pow(digit, length);
			n /= 10;
		
		}
		return sum == num;
	
	}
	public static void main(String[] args){
		int num = 153;
		System.out.println(isArmstrong(153));
	}
}