/*
	남궁성, Java의 정석, 3rd Edition(도우출판, 2016), p.24. 
*/

public class VarEx2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int tmp = 0;
	
		System.out.println("x:"+ x + " y:" + y);
		
		tmp = x;
		x = y;
		y = tmp;

		System.out.println("x:"+ x + " y:" + y);
	}
}
