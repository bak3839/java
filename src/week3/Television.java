package week3;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	void print() {
		System.out.println("채널은"+channel+"이고 볼륨은 "+volume+"입니다.");
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