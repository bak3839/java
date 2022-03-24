package week3;

import java.util.Scanner;

public class StrCmp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		
		while(true) {
			System.out.print("문자열을 입력하세요>");
			s = scan.nextLine();
			if(s.equals("quit")) break;
			else if((s.substring(0,3)).equals("www")) System.out.println(s+" 은 www 로 시작합니다.");
			else System.out.println(s+" 은 www 로 시작하지 않습니다.");
		}
	}
}
