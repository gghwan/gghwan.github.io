class CalendarTest{
     public static void main(String [] args){
           int year = Integer.parseInt(args[0]);
           int month = Integer.parseInt(args[1]);
           int day = 1;
           int hap=0;
//////////////////////////////////������� �� ����////////////////////////////////////
           for(int i=1;i<year;i++){
/*
����˰���
  1. year%400==0
  2. (year%4==0) && (year%100!=0)
*/
              if((i%400==0) || ((i%4==0) && (i%100!=0))){  //�����̶��
                    hap +=366;
              }else{  //������ �ƴ϶��
                    hap +=365;
              }
          }
////////////////////////////���� �̿��� ��������ϱ�////////////////////////////////
              if((year%400==0) || ((year%4==0) && (year%100!=0))){  //���ذ� �����̶��  
                   int [] test={31,29,31,30,31,30,31,31,30,31,30,31};
                   for(int i=0;i<(month-1);i++){
                         hap +=test[i];
                   }
              }else{  //���ذ� ������ �ƴ϶��
                   int [] test1={31,28,31,30,31,30,31,31,30,31,30,31};
                   for(int j=0;j<(month-1);j++){
                         hap +=test1[j];
                   }
              }
//////////////////////////////���� �̿��� �� ���� ����ϱ�/////////////////////////////
              for(int i=1;i<=day;i++){
                    hap++;
              }
              int space=0;
              switch(hap%7){
                   case 0:space=0;break;
                   case 1:space=1;break;
                   case 2:space=2;break;
                   case 3:space=3;break;
                   case 4:space=4;break;
                   case 5:space=5;break;
                   default:space=6;
              }
////////////////////////////////////maxDay�˱�////////////////////////////////////////
             int maxDay=0;
             switch(month){
                case 1: maxDay=31; break;
                case 2: 
	   if((year%400==0) || ((year%4==0) && (year%100!=0))){
                        maxDay=29; break;
                   }else{
                        maxDay = 28; break;
                   }
                case 3: maxDay=31; break;
                case 4: maxDay=30; break;
                case 5: maxDay=31; break;
                case 6: maxDay=30; break;
                case 7: maxDay=31; break;
                case 8: maxDay=31; break;
                case 9: maxDay=30; break;
                case 10: maxDay=31; break;
                case 11: maxDay=30; break;
                default: maxDay=31; 
             }
//////////////////////////////////////////�޷����////////////////////////////////////////////////
             int count=0;
             System.out.println("***********************" + year + " : " + month + "*****************************");
             System.out.println("=========================================================");
             System.out.println("��\t��\t��\t�\t��\t��\t��");
             System.out.println("---------------------------------------------------------");
             for(int i=0;i<space;i++){
                   System.out.print("��\t");
                   count++;
             }
             for(int i=1;i<=maxDay;i++){
	   System.out.print(i + "\t");
                   count++;
                   if(count%7==0){
                          System.out.println();
                          count = 0;
                   }
             }
             if(count!=0){
                 for(int i=0;i<(7-count);i++){
                     System.out.print("��\t");
                 }
             }
             System.out.println();
             System.out.println("Program is Over..");
     }
}







