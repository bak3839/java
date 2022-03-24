package week3;

public class ArrayTest3 { // 피보나치
	public static void main(String[] args) {
		int[] s = new int[20];
		s[0]=1;
		s[1]=1;
		for(int i = 1; i < s.length-1; i++) {
			s[i+1] = s[i] + s[i-1];
			System.out.print(s[i+1]+" ");
		}
	}
}
