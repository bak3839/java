package week3;

import java.util.Scanner;

public class Int2Hwd 
{
	public static void main(String args[]) 
	{
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("������ �Է��Ͻÿ�.");
		num=input.nextInt();
		
		switch(num) 
		{
		case 1:
			System.out.println("�ϳ�");
			break;
		case 2:
			System.out.println("��");
			break;
		default:
			System.out.println("����");
			break;
		}
	}
}
