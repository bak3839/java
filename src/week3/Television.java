package week3;

public class Television {
	private int channel;
	private int volume;
	private boolean onOff;
	
	Television(int c, int v, boolean o){
		channel = c;
		volume = v;
		onOff = o;
	}
	
	void print() {
		System.out.println("ä����"+channel+"�̰� ������ "+volume+"�Դϴ�.");
	}
	void chc(Television ctr) {
		ctr.channel = ctr.channel + 1; 
	}
	int getChannel() {
		return channel;
	}
	
	int add(int x, int y) {
		return x + y;
	}
	
	void SetChannel(int ch) {
		channel = ch;
	}
}