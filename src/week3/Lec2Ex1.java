package week3;

import java.util.Scanner;

public class Lec2Ex1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.print("�� ������ �Է��Ͻÿ�:");
		num1=input.nextInt();
		num2=input.nextInt();
		
		if(num1 > num2)
			System.out.println(num2+"����"+num1+"��(��) �� Ů�ϴ�.");
		else
			System.out.println(num1+"����"+num2+"��(��) �� Ů�ϴ�.");
	}
}
