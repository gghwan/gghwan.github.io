public class  SwitchTest{
	public static void main(String[] args) {
		int born_year = Integer.parseInt(args[0]);
		System.out.println("����� ���̴� " + (2002-born_year + 1) + "�� �̱���");
		//�����ι�������̽�������
		switch((2002-born_year) % 12){
			case 0: System.out.println("�����̳׿�");  break;
			case 1: System.out.println("����̳׿�");  break;
			case 2: System.out.println("����̳׿�");  break;
			case 3: System.out.println("�䳢���̳׿�");  break;
			case 4: System.out.println("�����̳׿�");  break;
			case 5: System.out.println("�Ҷ��̳׿�");  break;
			case 6: System.out.println("����̳׿�");  break;
			case 7: System.out.println("�������̳׿�");  break;
			case 8: System.out.println("�����̳׿�");  break;
			case 9: System.out.println("�߶��̳׿�");  break;
			case 10: System.out.println("�����̶��̳׿�");  break;
			default : System.out.println("����̳׿�"); 
		}
	}
}
