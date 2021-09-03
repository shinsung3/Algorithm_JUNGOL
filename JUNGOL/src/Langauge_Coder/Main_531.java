package Langauge_Coder;
import java.util.Scanner;

public class Main_531 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		sc = new Scanner(src);
		
		double a = sc.nextDouble();
//		50.80kg 이하를 Flyweight, 
//		61.23kg 이하를 Lightweight, 
//		72.57kg 이하를 Middleweight, 
//		88.45kg 이하를 Cruiserweight, 
//		88.45kg 초과를 Heavyweight
		
		if(a<=50.80) {
			System.out.println("Flyweight");
		}else if(a<=61.23) {
			System.out.println("Lightweight");
		}else if(a<=72.57) {
			System.out.println("Middleweight");
		}else if(a<=88.45) {
			System.out.println("Cruiserweight");
		}else {
			System.out.println("Heavyweight");
		}
	}
//	private static String src = "87.3";
}
