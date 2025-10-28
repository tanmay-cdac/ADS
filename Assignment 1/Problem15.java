import java.util.*;

public class Problem15{
	public static void main(String[] args){
		
		Map<String, String> map = new LinkedHashMap<>();
		map.put("alice", "a1");
		map.put("bob", "b1");
		map.put("alice", "a2");
		
		System.out.println(map);
		
		Map<String, String> map1 = new LinkedHashMap<>();
		map1.put("alice", "a1");
		map1.put("bob", "b1");
		map1.put("carol", "c1");
		
		map1.remove("bob");
		
		map1.put("bob", "b2");
		System.out.println(map1);
		
	}
}