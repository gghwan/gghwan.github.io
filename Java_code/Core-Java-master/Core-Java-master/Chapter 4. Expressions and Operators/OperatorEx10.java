/*
	남궁성, Java의 정석, 3rd Edition(도우출판, 2016), p.101.
*/

public class OperatorEx10 {
	public static void main(String args[]) { 
		int a = 1000000;

		int result1 = a * a / a;   // 1000000 * 1000000 / 1000000
		int result2 = a / a * a;   // 1000000 / 1000000 * 1000000

		System.out.printf("%d * %d / %d = %d\n", a, a, a, result1); 
		System.out.printf("%d / %d * %d = %d\n", a, a, a, result2); 	
	}
}
