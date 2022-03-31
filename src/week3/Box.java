package week3;

public class Box {
	int width, length, height;
	boolean k;
	Box(int w, int l, int h){
		width = w;
		length = l;
		height = h;
	}
	
	boolean isSameBox(Box ctr1){
		if(ctr1.width == width && ctr1.length == length && ctr1.height == height) {
			k = true;
			return k;
		}
		else {
			k = false;
			return k;
		}
	}
}
