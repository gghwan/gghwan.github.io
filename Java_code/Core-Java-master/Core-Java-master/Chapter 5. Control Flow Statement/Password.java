public class  Password{
	public static void main(String[] args) {
		char [] pass = {'A','B','C','D'};
		String userPass = args[0].trim();
		char [] test = new char[4];
		int i;
		for(i=0;i<4;i++){
			test[i] = userPass.charAt(i);
		}
		for(i=0;i<4;i++){
			if(pass[i] == test[i]) continue;  //������ i++
			else break;   //Ʋ���� break;
		}
		if(i == 4) System.out.println("�α��� ����");
		else System.out.println("�α��� ����");

	}
}
