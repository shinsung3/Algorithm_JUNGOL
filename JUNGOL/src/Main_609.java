import java.util.Arrays;
import java.util.Scanner;

public class Main_609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] arr = line.split(" ");

        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}