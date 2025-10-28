import java.util.*;

public class Problem13{
	public static void main(String[] args){
		
		Set<String> set = new TreeSet<>();
		set.add("Zara");
		set.add("Aman");
		set.add("Neha");
		
		System.out.println(set);

		boolean remove = set.remove("Neha");
		System.out.println(remove);
		
		System.out.println(set);
		
		Set<String> set2 = new TreeSet<>();
		set2.add("Meera");
		set2.add("meera");
		set2.add("Arjun");
		set2.add("Arjun");
		
		System.out.println(set2);

		boolean remove1 = set2.remove("Rahul");
		System.out.println(remove1);
		
		boolean remove2 = set2.remove("Meera");
		System.out.println(remove2);
		
		System.out.println(set2);
		
	}
}