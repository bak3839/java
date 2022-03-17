package week3;

import java.util.Scanner;

public class DaysInMonth 
{
	public static void main(String args[]) 
	{
		Scanner input = new Scanner(System.in);
		int month;
		
		System.out.print("월을 입력하시오:");
		month=input.nextInt();
		
		switch(month) 
		{
		case 2:
			System.out.println(month+"는 28일");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month+"는 31일");
			break;
		default:
			System.out.println(month+"는 30일");
		}
	}
}
