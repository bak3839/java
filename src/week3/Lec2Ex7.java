package week3;

import java.util.Scanner;

public class Lec2Ex7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int s[] = { 0, 11, 18, 29, 35, 49, 62, 68, 73, 88, 100 };
		int n;
		System.out.print("수 입력:");
		n = input.nextInt();

		for (int i = 0; i < s.length; i++) {
			if (s[i + 1] > n) {
				System.out.print(n + "은(는) " + s[i] + "보다 크고 " + s[i + 1] + "보다 작습니다.");
				break;
			}
		}
	}
}