
import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int year;
		
		System.out.print("���ϴ� �⵵�� �Է��Ͻÿ�:");
		year=input.nextInt();
		
		System.out.print("�����Դϱ�? "+((year%4)==0));
 }
}