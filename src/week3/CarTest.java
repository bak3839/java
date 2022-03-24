package week3;

public class CarTest {
	public static void main(String[] args) {
		Car s1 = new Car();
		
		s1.color = "red";
		s1.gear = 3;
		s1.speed = 40;
		
		System.out.println("색상:"+s1.color+" 기어:"+s1.gear+" 속도:"+s1.speed);
		System.out.println(s1.toString());
		s1.speed = s1.speedUp(s1.speed);
		s1.gear = s1.changeGear(s1.gear);
		System.out.println("색상:"+s1.color+" 기어:"+s1.gear+" 속도:"+s1.speed);
		System.out.println(s1.toString());
	}
}
