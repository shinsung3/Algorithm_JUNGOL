import java.util.*;

public class Main1 {
	public static void main(String[] args) {
//		HashMap - key, value 형태로 이루어져 있는 값
//		["1", 100] - Generic(Data Type) 2가지 
//		Key - Generic, Value - Generic (Data Type)

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// 1. 순서가 없다. Set, Map
		// 2. 중복이 허용 X -> Key는 중복할 수 없고, Value는 중복할 수 있음.
		// ["1" : 100] ["2" : 100] ["1" : 200] (X)

		map.put(1, "A");
		map.put(2, "B");
		map.put(1, "C"); //key 중복이 허용되지 않음
		map.put(3, "A");
		System.out.println(map);
		
		HashSet<Integer> hset = new HashSet<Integer>();
//		Set<Integer> set = new HashSet<Integer>();
		//Java OOP Set (부모 class) -> HashSet(자식 class) (상속받아 씀)
		//중복을 허용하지 않음, 덮어씌워지는지도 알 수 없음.
		//순서가 없음 -> 중복을 허용하지 않고, ?? -> index x
		hset.add(100);
		hset.add(200);
		hset.add(100);
		hset.add(300);
		
		System.out.println(hset);
		System.out.println(hset.size());
		
		for(int a : hset) {
			System.out.println(a);
		}
		
		Set<Integer> set = map.keySet(); //[1,2,3]
		for(int a : set) {
			String value = map.get(a);
			System.out.println(value);
		}
		
//		map.clear();
		

	}
}