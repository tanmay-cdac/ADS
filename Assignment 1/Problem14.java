import java.util.*;

public class Problem14{
	public static void main(String[] args){
		
		Map<Integer, String> map = new HashMap<>();
		map.put(205, "Refactoring");
		map.put(101, "Clean_Code");
		map.put(150, "Effective_Java");
		
		System.out.println(map);
		
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Alpha");
		map1.put(2, "Beta");
		
		System.out.println(map1.containsKey(2));
		map1.put(2, "Beta_2nd_Ed");
		
		System.out.println(map1.containsKey(1));
		map1.remove(1);
		
		System.out.println(map1);
		
		
	}
}