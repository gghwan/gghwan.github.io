public class ForTest2 {
	public static void main(String[] args) {
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		int sum = 0;
		for(int i = start; i <= end ; i++){
			sum += i;   // sum = sum + i;
		}
		System.out.println(start + "���� " + end + "������ ���� " + sum + "�Դϴ�");
	}
}
