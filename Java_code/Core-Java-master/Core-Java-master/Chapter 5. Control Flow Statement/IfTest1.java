public class  IfTest1{
	public static void main(String[] args) {
		String str = args[0].trim();
		System.out.println("str = " + str);
		if(str.equals("��")){
			System.out.println("���޷�, ������");
		}else if(str.equals("����")){
			System.out.println("��ī�þ�, ���");
		}else if(str.equals("����")){
			System.out.println("��ȭ, ����");
		}else{
            System.out.println("����, ��ȭ");
		}
	}
}
