/*
*조효은, 초보자를 위한 JAVA 200제(서울:정보문화사, 2011), p.484-485
*은닉화
*/

public class AirplaneMain {
	public static void main(String[] args) {
		Airplane air858=new Airplane();
		air858.nameOfAirp="손오공";     //비행기이름
		air858.fuel=6000;                 //liter
		//air858.fuel=100;   //100liter 이하면 연료부족인데??
		air858.goPerL=11;                 //1km/liter
		System.out.print("  비행기 이름: "+air858.nameOfAirp);
		System.out.print("  비행거리   : "+air858.goPerL*air858.fuel+"km\n");
	}
}
