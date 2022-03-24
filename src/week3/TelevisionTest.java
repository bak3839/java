package week3;

public class TelevisionTest {
	public static void main(String[] args) {
		Television mytv = new Television();
		mytv.SetChannel(11);
		mytv.volume = 9;
		mytv.onOff = true;
		int ch = mytv.getChannel();
		
		System.out.println("현재 채널은 "+ch+"입니다.");
		//mytv.print();
		
		Television yourtv = new Television();
		yourtv.channel = 9;
		yourtv.volume = 12;
		yourtv.onOff = true;
		yourtv.print();
	
		System.out.println(mytv.add(mytv.channel, yourtv.channel));
		System.out.println("텔레비전의 채널은 "+mytv.channel+"이고 볼륨은 "+mytv.volume+"입니다.");
		System.out.println("텔레비전의 채널은 "+yourtv.channel+"이고 볼륨은 "+yourtv.volume+"입니다.");
	}
}
