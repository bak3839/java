package week3;

import java.util.Scanner;

public class Lec2Ex5 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double Pi = 0;
		int n = 1;
		int count;
		
		System.out.print("반복횟수 입력:");
		count = input.nextInt();
		
		for(int i = 1; i <= count; i++) {
			if(i % 2 == 0)
			{
				Pi -= (double)4/n;
				n += 2;
				continue;
			}
			Pi += (double)4/n;
			n += 2;
		}
		System.out.println("파이값:"+Pi);
	}
}
