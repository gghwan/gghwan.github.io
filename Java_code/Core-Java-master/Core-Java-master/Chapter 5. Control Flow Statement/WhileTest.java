public class  WhileTest{
	public static void main(String[] args) {
		/*
			for(�ʱ�ġ;����;����ġ){
	        }
			�ʱ�ġ;
			while(����){
                  ����;
				  ����ġ;
	        }
		*/
		//for(int i=1;i<=10;i++){
		//	System.out.print(i + "\t");
		//}
		int i=1;
		int count = 0;
		while(i<101){
            if(i%5==0){
				System.out.print(i + "\t");
				count++;
				if(count % 7 ==0){
					System.out.println();
				}
			}
			i++;
		}
	}
}
