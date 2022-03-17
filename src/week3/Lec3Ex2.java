package week3;

import java.util.Scanner;

public class Lec3Ex2 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int num;
		int i;
		
		System.out.print("양수를 입력하시오:");
		num=input.nextInt();
		
		for(i = 1; i <= num; i++) {
			if(num % i == 0 )
				System.out.print(i+" ");
		}
	}
}
