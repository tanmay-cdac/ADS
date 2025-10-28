import java.util.*;

public class Problem11{
	public static void main(String[] args){
		
		List<Character> list = new LinkedList<>();
		list.add('A');
		list.add('B');
		list.add('C');
		
		list.remove(0);
		
		list.set(1,'X');
		System.out.println(list);
		
	}
}