/*
	남궁성, Java의 정석, 3rd Edition(도우출판, 2016), p.137.
*/

public class FlowEx1 {
	public static void main(String[] args) { 
		int x= 0;

		System.out.printf("x=%d 일때, 참인 것은%n", x);

		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		System.out.println();

		x = 1;
		System.out.printf("x=%d 일때, 참인 것은%n", x);

		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
	}
}
