package week3;

import java.util.Scanner;

public class DaysInMonth 
{
	public static void main(String args[]) 
	{
		Scanner input = new Scanner(System.in);
		int month;
		
		System.out.print("���� �Է��Ͻÿ�:");
		month=input.nextInt();
		
		switch(month) 
		{
		case 2:
			System.out.println(month+"�� 28��");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month+"�� 31��");
			break;
		default:
			System.out.println(month+"�� 30��");
		}
	}
}
