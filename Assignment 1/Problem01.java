public class Problem01{
    public static boolean armstrongrecursion(int num, int original, int length, int sum){
		if(num == 0){
			return sum == original;
		}
		
		int digit = num%10;
		sum += Math.pow(digit, length);
		return armstrongrecursion(num/10, original, length, sum);
	}		
			
		

    public static void main(String[] args) {
        int num = 153;
		int length = String.valueOf(num).length();
		
		System.out.println(armstrongrecursion(num,num,length,0));
    }
}

/*
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
}*/