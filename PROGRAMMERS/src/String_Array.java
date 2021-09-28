import java.util.Arrays;

public class String_Array {
	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(s);
		
		//1.문자열의 길이는?
		System.out.println(s.length());
		
		//2.문자열을 한개씩 가져오기. charAt(idx) == character
//		System.out.println(s.charAt(0));
//		System.out.println(s.charAt(1));
//		System.out.println(s.charAt(2));
		for(int i=0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		//3. 일부 문자열 가져오기.
		System.out.println(s.substring(6));                               
		//                            beginIndex <=index, EndIndex>index
		//                             6, 7, 8
		System.out.println(s.substring(6,9));
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(6));
		System.out.println(s.charAt(9));
		//len(s) == s.length()
		
		//4.대체시키기.
		//                     before, after
		String s2 = s.replace("Hello", "Hi");
		System.out.println("4. 대체 == "+s2);
		
		//5. s == 문자열 String[] 
		String s3[] = s.split(" ");
		//배열을 빠르게 출력하는 용도 = Arrays.toString(배열)
		System.out.println(Arrays.toString(s3));
		
		//6. l을 기준으로 해서 배열 split하기
		String s4[] = s.split("l");
		System.out.println(Arrays.toString(s4));
		
//		100 50 40
		String number = "100 50 40";
		String[] numArray = number.split(" ");
		System.out.println(Arrays.toString(numArray));
		
		int a = 100;
		int b = 50;
		if(a==b) {
			System.out.println("Hello");
		}else {
			System.out.println("world");
		}
		
		//문자열 비교 .eqauls()
		String str1 = "Hello"; // 저장된 장소의 주소 : 100 value = "Hello"
		String str2 = "Hello"; // 저장된 장소의 주소 : 101 value = "Hello"
								// if(str1==str2) 저장소 100==101? false
		//value를 비교하기 위해서는 equals()
		if(str1.equals(str2)) {
			System.out.println("값이 같아.");
		}
		
		//문자열이 포함되어져 있는지 알아보기.
		String s5 = "Hello";
		if(s.contains("Hi")) {
			System.out.println("포함되어져있어요.");
		}
		
		String s6 = "HelloWorld";
		//모든 걸 소문자로 바꾸기.
		String s7 = s6.toLowerCase();
		System.out.println(s7);
		s7 = s6.toUpperCase();
		System.out.println(s6);
		
		//캐릭터 어레이로 한글자씩 쪼개서 만들때,
		char[] character = s6.toCharArray();
		System.out.println(Arrays.toString(character));
		
		//정렬 알고리즘 -> 선택정렬, 버블정렬, 퀵정렬, 합병정렬
		Arrays.sort(character); //퀵정렬
		System.out.println(Arrays.toString(character));
	}
}











