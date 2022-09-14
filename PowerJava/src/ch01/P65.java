package ch01;

import java.util.Scanner;
/*
 * 날짜 : 2022/09/02
 * 이름 : 라성준
 * 내용 : 사용자로부터 입력받은 두 수를 더하기
 */

public class P65 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		int x , y , sum ;
		
		System.out.println("첫 번째 숫자를 입력하시오: 10"); //줄을 바꾸지 않는다.
		x = sc.nextInt();
		
		System.out.println("두 번째 숫자를 입력하시오: 20");
		y = sc.nextInt();
		
		sum = x + y;
		System.out.println(sum); // 합을 출력한다.
	}

}
