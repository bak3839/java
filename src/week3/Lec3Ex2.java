package week3;

import java.util.Scanner;

public class Lec3Ex2 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int num;
		int i;
		
		System.out.print("����� �Է��Ͻÿ�:");
		num=input.nextInt();
		
		for(i = 1; i <= num; i++) {
			if(num % i == 0 )
				System.out.print(i+" ");
		}
	}
}
