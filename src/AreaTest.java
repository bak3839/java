
import java.util.Scanner;

public class AreaTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		double radius;
		final double PI=3.141592;
		
		System.out.print("�������� �Է��Ͻÿ�:");
		radius=input.nextDouble();
		
		double area =PI*radius*radius;
		
		System.out.println("��������"+radius+"�� ���� ������"+area+"�Դϴ�.");
	}
}
