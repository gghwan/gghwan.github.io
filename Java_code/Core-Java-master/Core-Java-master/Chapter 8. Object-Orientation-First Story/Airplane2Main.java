/*
*조효은, 초보자를 위한 JAVA 200제(서울:정보문화사, 2011), p.489
*this이해하기
*/

public class Airplane2Main {
	public static void main(String[] args) {
		Airplane2 air948 =new Airplane2("이글 파이브",6000,11);
		System.out.println(air948.toString());	
		Airplane2 air947 =new Airplane2("센타 파이브");
		System.out.println(air947);	
		Airplane2 air949 =new Airplane2();
		System.out.println(air949);	
	}
}
