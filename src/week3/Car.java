package week3;

public class Car {	
	private String model;
	private String color;
	private int speed;
	
	private int id;
	private static int numbers = 0;
	
	public Car(String m, String c, int s) {
		model = m;
		color = c;
		speed = s;
		id = ++numbers;
	}
	
	public static int getNumberOfCars() {
		return numbers;
	}
	/*int changeGear(int g) {
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
	}*/
}