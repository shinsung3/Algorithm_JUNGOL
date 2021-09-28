import java.util.Scanner;

public class basic { // class 이름이 Main
	// ctrl + space bar = 자동완성
	// main Method => main + 자동완성
	// sysout + 자동완성
	// 실행 = ctrl + F11
	public static void main(String[] args) {
		System.out.println("1. Hello World"); // standard output == 기본적인 print
		// 입력 하는 문제 x
//		Scanner sc = new Scanner(System.in); //standard input
//		int a = sc.nextInt(); // a = 정수 입력
//		System.out.println("2. "+a); // a = 출력

		// DATA TYPE
		int a = 1; // 2,3,4,5 정수형 Integer
		// double 실수형 5.5 + 4.5
		double b = 5.5;
		double c = 4.5;
		System.out.println("2. " + (b + c));
		char d = 'H'; // character = 문자"형"(단어가 1개만) vs 문자열 = String
		String e = "Hello";
		System.out.println(d + " World"); // ""<<이표시가 들어간다면 문자열이 된다.
		System.out.println(e + " World");

		// > < >= <= : 관계 연산자
		if (b > c) { // 논리연산자 -> b>c 5.5 > 4.5 = if(true){}
		}
		if (c > b) { // c = 4.5 b = 5.5 if(false){} //true, false 논리연산자
		}
		System.out.println(b < c);

		// for i in list: list=[4,5,231,2,3]
		// 짝수 =? i%2==0, 4커질때, 5로 커질때,
		for (int i = 3; i < 10; i += 3) { //N 
			for (int j = 0; j < 10; j++) { // N^2
				System.out.print(i + " "); 
				// N^3 = N*N*N 1000 1000 1000 = 10억 => x 1억
			}
		}
//		for(초깃값;종료값;증가값)
	}
}
