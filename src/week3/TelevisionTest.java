package week3;

public class TelevisionTest {
	public static void main(String[] args) {
		Television mytv = new Television();
		mytv.SetChannel(11);
		mytv.volume = 9;
		mytv.onOff = true;
		int ch = mytv.getChannel();
		
		System.out.println("���� ä���� "+ch+"�Դϴ�.");
		//mytv.print();
		
		Television yourtv = new Television();
		yourtv.channel = 9;
		yourtv.volume = 12;
		yourtv.onOff = true;
		yourtv.print();
	
		System.out.println(mytv.add(mytv.channel, yourtv.channel));
		System.out.println("�ڷ������� ä���� "+mytv.channel+"�̰� ������ "+mytv.volume+"�Դϴ�.");
		System.out.println("�ڷ������� ä���� "+yourtv.channel+"�̰� ������ "+yourtv.volume+"�Դϴ�.");
	}
}
