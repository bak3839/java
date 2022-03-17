package week3;

import java.util.Scanner;

public class Lec2Ex1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.print("두 정수를 입력하시오:");
		num1=input.nextInt();
		num2=input.nextInt();
		
		if(num1 > num2)
			System.out.println(num2+"보다"+num1+"이(가) 더 큽니다.");
		else
			System.out.println(num1+"보다"+num2+"이(가) 더 큽니다.");
	}
}
