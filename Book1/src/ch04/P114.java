package ch04;
/*
 * 날짜 : 2022/08/23
 * 내용 : for문 예제
 * 이름 : 라성준
 */
public class P114 {
	public static void main(String[] args) {
		int i;
		int sum;
		for(i = 1, sum = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합은" + sum + "입니다");
	}

}
