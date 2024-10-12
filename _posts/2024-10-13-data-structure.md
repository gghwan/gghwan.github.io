다음 코드의 출력값을 작성하시오
#include <stdio.h>
int main() {
 int result[5];
 int arr[5] = {77, 32, 10, 99, 50};
 for(int i= 0; i< 5; i++) {
 result[i] = 1;
 for(int j = 0; j < 5; j++) {
 if(arr[i] < arr[j]) {
 result[i]++;
 }
 }
 }
 for(int k = 0; k < 5; k++) {
 printf("%d ", result[k]);
 }
 return 0;
}
