package week3;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("������ �Է��Ͻÿ�:");
		num=input.nextInt();
		
		if(num % 2 == 0)
			System.out.println("¦���Դϴ�.");
		else
			System.out.println("Ȧ���Դϴ�.");
	}
}
