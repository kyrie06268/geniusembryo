package day05;

public class Ex_ArrayRandom {

	public static void main(String[] args) {
		int [] r = new int[6];
		for(int i = 0; i < r.length; i++) {
			r[i]=(int)(1+10*Math.random());
			System.out.print(r[i]+" ");
		}
		
		System.out.println();
		draw(45, 6);

	}
public static void draw(int max, int length) {
	int [] s = new int[length];
	for(int i = 0; i < length; i++) {
		s[i]=(int)(1+max*Math.random());
		System.out.println(s[i]);
	}
	
}
public static int[] draw(int min, int max, int s) {
	if(s <= 0) {
		return null;
	}	
	else{
		int [] q = new int[s];
			for(int i = 0; i < q.length; i++) {
				q[i]=(int)(1+10*Math.random());
				}
			return q;}
			}
}

