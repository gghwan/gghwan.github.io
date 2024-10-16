/*
*윤성우, 난 정말 JAVA를 공부한 적이 없다구요!(서울:오렌지미디어, 2012), p.379-380
*/

class Man{
	private String name;
	public Man(String name){this.name=name;}
	public void tellYourName() { System.out.println("My name is "+name); }
}

class BusinessMan extends Man{
	private String company; 	// 회사이름
	private String position;	// 직급
	public BusinessMan(String name, String company, String position){
		super(name);
		this.company=company;
		this.position=position;
	}
	public void tellYourInfo(){
		System.out.println("My company is "+company);
		System.out.println("My position is "+position);
		tellYourName();   	// Man 클래스를 상속했기 때문에 호출 가능!
	}
}

public class BasicInheritance{
	public static void main(String[] args){
		BusinessMan man1
			=new BusinessMan("Mr. Hong", "Hybrid 3D ELD", "Staff Eng.");
		BusinessMan man2
			=new BusinessMan("Mr. Lee", "Hybrid 3D ELD", "Assist Eng.");
	
		System.out.println("First man info..........");
		man1.tellYourName();
		man1.tellYourInfo();
		
		System.out.println("Second man info..........");
		man2.tellYourInfo();
	}
}