package week3;

public class Rectangle311 extends Shape311{
	private int width, height;
	
	public void setW(int w) {
		this.width = w;
	}
	
	public void setH(int h) {
		this.height = h;
	}
	
	public int getW() {
		return this.width;
	}
	
	public int getH() {
		return this.height;
	}
	
	public double area() {
		return width * height;
	}
	
	public void draw() {
		System.out.println("("+getX()+","+getY()+") 넓이:"+area()+" 가로:"+width+" 세로:"+height);
	}
}
