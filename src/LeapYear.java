
import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int year;
		
		System.out.print("원하는 년도를 입력하시오:");
		year=input.nextInt();
		
		System.out.print("윤년입니까? "+((year%4)==0));
 }
}