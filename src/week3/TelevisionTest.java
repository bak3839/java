package week3;

public class TelevisionTest {
	public static void main(String[] args) {
		/*Television mytv = new Television();
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
		yourtv.print();*/
		
		Television obj1 = new Television(11, 9, true);
		Television obj2 = new Television(7, 2, true);
		
		obj1.print();
		obj2.print();
		obj1.chc(obj1);
		obj1.print();
		/*System.out.println(mytv.add(mytv.channel, yourtv.channel));
		System.out.println("�ڷ������� ä���� "+obj1.c+"�̰� ������ "+mytv.volume+"�Դϴ�.");
		System.out.println("�ڷ������� ä���� "+yourtv.channel+"�̰� ������ "+yourtv.volume+"�Դϴ�.");*/
	}
}
