package Langauge_Coder;

import java.util.Arrays;
import java.util.Scanner;

public class Main_610 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[5];
		for(int i=0; i<5; i++) {
			String str = sc.nextLine();
			arr[i] = str;
		}
		Arrays.sort(arr);
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}
}
