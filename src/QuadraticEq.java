
import java.util.Scanner;

public class QuadraticEq {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float b;
		float c;
		
		System.out.print("b를 입력하시오:");
		b=input.nextFloat();
		
		System.out.print("c를 입력하시오:");
		c=input.nextFloat();
		boolean cp;
		cp=(b*b-4*c)>0;
		
		System.out.println("두 근이 존재합니까? "+cp);
		System.out.println("근1:"+(-b+(Math.sqrt(b*b-4*c)))/2);
		System.out.println("근2:"+(-b-(Math.sqrt(b*b-4*c)))/2);
	}
}
