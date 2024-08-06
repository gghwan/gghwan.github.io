



#오늘 함수 호출 및 조건 입력 그리고 출력하는 방식에서 형변환 까지 배움.

function interestCalculator(amount, term, rate) {

  return amount * term * rate / 100;

 }

 

 // 조건 입력 테스트

 let myMoney = 3650000; // 맡긴 금액 (원)

 let saveTerm = 1; // 맡기는 기간 (년)

 let interestRate = 4; // 이자율 (%)

 

 // 수령액 계산 테스트

 let myInterest = interestCalculator(myMoney, saveTerm, interestRate);

 let totalMoney = myMoney + myInterest;

 

 // 출력 테스트

 console.log('맡긴 금액은 ' + myMoney + '원 입니다.');

 console.log('이자는 ' + myInterest + '원 입니다.');

 console.log('최종 받을 금액은 ' + totalMoney + '원 입니다.');

 

 console.log(typeof ('4' + 3));

 console.log(typeof (3 - true));

 console.log(typeof (Boolean(5) * true));

 console.log(typeof (true < false));