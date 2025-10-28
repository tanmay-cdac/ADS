import java.util.*;

public class Problem12{
	public static void main(String[] args){
		
		Set<Character> set = new HashSet<>();
		set.add('A');
		set.add('A');
		set.add('B');
		
		System.out.println(set);

		System.out.println(set.contains('A'));
		System.out.println(set.contains('C'));
		
		
	}
}