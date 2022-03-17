package week3;

public class Lec3Ex3 {
	public static void main(String args[])
	{
		int i;
		
		for(int num = 1; num <= 1000; num++) 
		{
			for(i = 2; i < num; i++) {
				if(num % i == 0)
					break;
			}
			if(num == i)
				System.out.print(num+" ");
		}
	}
}
