/*
	남궁성, Java의 정석, 3rd Edition(도우출판, 2016), p.139.
*/

import java.util.Scanner;

public class FlowEx2 {
	public static void main(String[] args) {  
		int input;

		System.out.print("숫자를 하나 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		input = Integer.parseInt(tmp);   // 입력받은 문자열(tmp)을 숫자로 변환

		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");	
		}

		if(input!=0)
			System.out.println("입력하신 숫자는 0이 아닙니다.");		
			System.out.println("입력하신 숫자는 "+ input +"입니다.");
	} // main의 끝
}
