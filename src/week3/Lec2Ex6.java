package week3;

public class Lec2Ex6 {
	public static void main(String[] args) {
		int[] n= {12, 3, 19, 6, 18, 8, 12, 4, 1, 19};
		int min=n[0];
		
		for(int i=1; i<n.length; i++)
			if(min > n[i]) min = n[i];
		
		System.out.print("ÃÖ¼Ú°ª:"+min);
	}
}
