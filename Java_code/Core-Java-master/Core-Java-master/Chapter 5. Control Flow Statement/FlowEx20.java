/*
	남궁성, Java의 정석, 3rd Edition(도우출판, 2016), p.165.
*/

public class FlowEx20 {
	public static void main(String[] args) { 
		for(int i=1;i<=5;i++) { 
			for(int j=1;j<=5;j++) {
				System.out.printf("[%d,%d]", i, j);			
			}
			System.out.println();
		}
	} // main의 끝
}
