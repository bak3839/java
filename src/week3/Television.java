package week3;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	void print() {
		System.out.println("ä����"+channel+"�̰� ������ "+volume+"�Դϴ�.");
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