
import java.util.Scanner;

public class QuadraticEq {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float b;
		float c;
		
		System.out.print("b�� �Է��Ͻÿ�:");
		b=input.nextFloat();
		
		System.out.print("c�� �Է��Ͻÿ�:");
		c=input.nextFloat();
		boolean cp;
		cp=(b*b-4*c)>0;
		
		System.out.println("�� ���� �����մϱ�? "+cp);
		System.out.println("��1:"+(-b+(Math.sqrt(b*b-4*c)))/2);
		System.out.println("��2:"+(-b-(Math.sqrt(b*b-4*c)))/2);
	}
}
