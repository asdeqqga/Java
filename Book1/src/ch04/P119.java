package ch04;
/*
 * 날짜 : 2022/08/23
 * 내용 : continue문 예제
 * 이름 : 라성준
 */
public class P119 {
	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) { //100까지 반복
			if(num % 2 == 0)			  //num 값이 짝수인 경우
				continue;				  //이후 수행을 생략하고 num++수행
			total += num; 				  //num rkqtdl 홀수인 경우에만 수행	
		}
		System.out.println("1부터 100까지의 홀수의 합은: " + total + "입니다");
	}

}
