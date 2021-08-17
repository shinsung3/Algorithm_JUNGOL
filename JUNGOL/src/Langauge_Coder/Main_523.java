package Langauge_Coder;

import java.util.Scanner;

public class Main_523 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

//		if(조건문) {
//			실행결과
//		}else{
//			위 조건이아닐때 실행될 것
//		}
		if (a > b) {
			System.out.println(a+" > "+b+" --- "+true);
		}else {
			System.out.println(a+" > "+b+" --- "+false);
		}
		
		if (a < b) {
			System.out.println(a+" < "+b+" --- "+true);
		}else {
			System.out.println(a+" < "+b+" --- "+false);
		}
		
		if (a >= b) {
			System.out.println(a+" >= "+b+" --- "+true);
		}else {
			System.out.println(a+" >= "+b+" --- "+false);
		}
		
		if (a <= b) {
			System.out.println(a+" <= "+b+" --- "+true);
		}else {
			System.out.println(a+" <= "+b+" --- "+false);
		}
	}
}
