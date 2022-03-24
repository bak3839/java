package week3;

import java.util.Scanner;

public class Car {
	Scanner input = new Scanner(System.in);
	
	String color;
	int gear;
	int speed;
	
	int changeGear(int g) {
		System.out.print("변경 할 기어 입력:");
		g = input.nextInt();
		return g;
	}
	
	int speedUp(int s) {
		System.out.println("속력 10km/h 증가");
		s += 10;
		return s;
	}
	
	int speedDown(int s) {
		System.out.println("속력 10km/h 감소");
		s -= 10;
		return s;
	}
	
	public String toString() {
		return "Car[color=" +color+ ",speed=" +speed+" ,gear=" +gear+"]";
	}
}