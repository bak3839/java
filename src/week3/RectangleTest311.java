package week3;

public class RectangleTest311 {
	public static void main(String[] args) {
		Rectangle311 rec1 = new Rectangle311();
		Rectangle311 rec2 = new Rectangle311();
		
		rec1.setX(5);
		rec1.setY(8);
		rec1.setW(10);
		rec1.setH(20);
		
		rec2.setX(8);
		rec2.setY(9);
		rec2.setW(10);
		rec2.setH(20);
		
		rec1.print();
		rec1.draw();
		
		rec2.print();
		rec2.draw();
	}
}
