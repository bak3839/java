package week3;

import java.util.Scanner;

public class StrCmp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		
		while(true) {
			System.out.print("���ڿ��� �Է��ϼ���>");
			s = scan.nextLine();
			if(s.equals("quit")) break;
			else if((s.substring(0,3)).equals("www")) System.out.println(s+" �� www �� �����մϴ�.");
			else System.out.println(s+" �� www �� �������� �ʽ��ϴ�.");
		}
	}
}
