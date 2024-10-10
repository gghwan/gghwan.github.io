python 문자열
 

문자열이란 무엇인가?

 

파이썬에서 문자열은 문자들의 집합으로, 문자의 순서를 유지한채로 저장되는 데이터 타입이다.

 

문자열은 텍스트 데이터를 다루기위한 기본적인 데이터유형이며, 작은 따옴표 또는 큰 따옴표로 감싸서 표현할 수 있다.

 

파이썬에서는 이 두가지 따옴표 방식이 서로 호환되어 사용할 수 있다.

 

list 형태

 

c언어
char fruits_and_veggies[3][10] = {"apple", "banana", "carrot"};

 

python
fruits_and_veggies = ["apple", "banana", "carrot"]

 

문자열 템플릿이란?
-> 포맷팅한다. 문자열을 출력할 때, 변수나 함수의 리턴값을 한번에 표기하고 싶다.

 

배열의 값을 직접 뽑아내서 한번에 표기하고 싶다.

특정한 틀에 맞춰서 문자를 출력해 보자.

 

%를 통한 포맷팅
str.format()을 통한 포맷팅
f-string
일반변수, 함수, 배열(파이썬은 리스트)이다.

-> 이 3가지 유형으로 잘나옴.

문자열은 문자열끼리 더할 수 있다.

list -> str로 형변환 하여 더하는 방식이 가능하다.

 

name = "홍길동" 
age = 30  
def next_year_age(age):  
return age + 1  
fruits_and_veggies = ["apple", "banana", "carrot"]  

formatted_string = "안녕하세요, 제이름은%s입니다. 내년에는 %d 살이 됩니다. I have a %s, and a %s." %( name, next_year_age(age), fruits_and_veggies[0], fruits_and_veggies[1], fruits_and_veggies[2])  print(formatted_string)  

""로 감싼 문자열에 %s, %d로 입력

그리고 순서대로 해당값을 쉼표로 쓴다.

여러개일 경우 괄호로 묶어서 표기한다.

 

출력값: 안녕하세요, 제이름은 홍길동입니다. 내년에는 31살이 됩니다. I have a apple, a banana. and a carrot.

 

name = "홍길동" 
age = 30  
def next_year_age(age):  
return age + 1  
fruits_and_veggies = ["apple", "banana", "carrot"]  

formatted_string = "안녕하세요, 제이름은 {}입니다. 내년에는 {}살이 됩니다. I have a {}, a {} and a {}." %( name, next_year_age(age), fruits_and_veggies[0], fruits_and_veggies[1], fruits_and_veggies[2])  print(formatted_string)  

앞에 문자열을 선언하고 표기하고 싶은 순서대로 {} 중괄호로 구멍을 뚫어 놓는다.

 

name = "홍길동" 
age = 30  
def next_year_age(age):  
return age + 1  
fruits_and_veggies = ["apple", "banana", "carrot"]  

formatted_string = f"안녕하세요, 제이름은{name}입니다. 내년에는 {next_year_age(age)}살이 됩니다. I have a {fruits_and_veggies[0]}, a {fruits_and_veggies[1]} and a {fruits_and_veggies[2]}."

print(formatted_string)  

전체 문자열을 먼저 선언하고, 맨 앞의 "문자열 밖"에 f을 작성

 

문자열 안에 {변수명}을 써서 직접 넣어서 출력.

순서대로가 아니라 직접 명시한다는 것을 주의

Python 에서의 반복
 

for, while

 

list형태의 반복문과 range 함수에 대해서

 

numbers = [1,2,3,4,5]
for number in numbers:
   print(number)
text = "Hello"
for char in text:
    print(char)
 

matrix = [
 [1, 2, 3],
 [4, 5, 6],
 [7, 8, 9]
]
for row in matrix:
  for element in row:
    print(element, end = " ")
  print()
출력값:

123

456

789

 

for i in range(2,6):

print(i)

출력값:

2

3

4

5

 

#10부터 1까지 2씩 감소하는 숫자를 출력

for i in range(10, 0, -2):

print(i)

 

출력값:

10

8

6

4

2

 

10부터 1까지 2씩 감소하는 숫자를 출력

#include <stdio.h>

int main(){
  int a = 5; //0101
  int b = 3; //0011
  int result = a | b; //0111

  printf("a | b 의 결과: %d \n", result);
  return 0;
}

xor 연산
 

0101

0011

-> 0110

 

^하나만 쓰는 연산자는, 앞 뒤를 이진수로 바꾼 이후

두 비트가 다른경우 1을 반환한다.

(둘다 같은 값인 경우 0으로 작성)

같은 자리수를 비교해서 답을 도출하면 된다.

 

출력값:

a^b의 결과: 6

(0110을 십진수로 표현해서 출력)

XOR 값 스왑
# include <stdio.h>

int main() {
  int a = 5;
  int b = 10;

  printf("스왑전: a = %d, b = %d \n", a,b);

  a = a^b;
  b = a^b;
  a = a^b;

  printf("스왑후: a = %d, b = %d\n", a,b);

  return 0;
}

출력값:
스왑전: a = 5, b = 10
스왑후: a = 10, b = 5

Not 연산자 (~)
 

#include <stdio.h>

int main(){
  int a = 5;
  int result = ~a;

  printf(" ~a의 결과: %d\n", result);
  return 0;
}

출력값:
~a : -6
(2의 보수로 인하여 -6이 도출됨)

10을 2의 보수로 계산하면
10 + 1 -> -11

&(AND) : 비트가 둘다 1일때 1로 작성

| (OR) : 둘중에 하나만 1일때 1로 작성

^ (XOR) : 비트가 다르면 1, 같으면 0

~ ( NOT) : 전체 비트를 반대로 바꾼다. ( +1 하고 음수취하기)
