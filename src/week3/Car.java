package week3;

import java.util.Scanner;

public class Car {
	Scanner input = new Scanner(System.in);
	
	String color;
	int gear;
	int speed;
	
	int changeGear(int g) {
		System.out.print("���� �� ��� �Է�:");
		g = input.nextInt();
		return g;
	}
	
	int speedUp(int s) {
		System.out.println("�ӷ� 10km/h ����");
		s += 10;
		return s;
	}
	
	int speedDown(int s) {
		System.out.println("�ӷ� 10km/h ����");
		s -= 10;
		return s;
	}
	
	public String toString() {
		return "Car[color=" +color+ ",speed=" +speed+" ,gear=" +gear+"]";
	}
}