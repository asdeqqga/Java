package step02;

import java.util.Scanner;
/*
 * 날짜 : 2022/10/23
 * 이름 : 라성준
 * 내용 : 백준문제 2단계 1번 문제 두 수 비교하기
 */
public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
					
		if(A>B) System.out.println(">");
		
		else if (A<B) System.out.println("<");
		
		else System.out.println("==");
	}
}
