package week3;

import java.util.Scanner;

public class Lec2Ex7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int s[] = { 0, 11, 18, 29, 35, 49, 62, 68, 73, 88, 100 };
		int n;
		System.out.print("�� �Է�:");
		n = input.nextInt();

		for (int i = 0; i < s.length; i++) {
			if (s[i + 1] > n) {
				System.out.print(n + "��(��) " + s[i] + "���� ũ�� " + s[i + 1] + "���� �۽��ϴ�.");
				break;
			}
		}
	}
}