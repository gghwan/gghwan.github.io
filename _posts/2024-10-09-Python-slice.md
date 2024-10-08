문자열 슬라이싱

파이썬에서 문자열 슬라이싱은 문자열의 특정 부분을 추춣하는 기법이다.

 

인덱스를 사용하여 접근할 수 있다. 콜론을 사용하여 인덱스 범위를 지정한다.

 

문자열을 자른다고 표현한다.

substring = string[start:end]

start : 인덱스의 시작

end: 인덱스의 끝

print(substring)

 

string = "Hello World!"

sliced_variable = string[0 : 5] # 'Hello' -> 0~4까지만

두번째 인덱싱 즉 마지막 인덱싱은 포함하지 않는다.(Hello)

 

string = "Hello, World!"

substring = string[7:] #World!

 

substring = sting[:5] #'Hello'

 

substring = string[ -6: -1] #World -> 느낌표는 제외

 

Step

 

substring[::2]

2씩 건너뛰겠다는 의미

Hello, World!

H^l^o ^o^l^!

 

str1 = "Hello, World!"

str2 = "Python Programming"

str3 = "This is an example"

 

part1 = str1[:5] #Hello

part2 = str2[7:18] # Programming

part3 = str3[-4:] #mple

 

result = part1 + part2 + part3

print(result)

 

결과: HelloProgrammingmple
