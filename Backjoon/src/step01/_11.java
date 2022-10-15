package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/10/15
 * 이름 : 라성준
 * 내용 : 백준 1단계 11번 문제 나머지값 구하기
 */
public class _11 {
	public static void main(String[] args) {
		
		Scanner qq = new Scanner(System.in);
		
		int A = qq.nextInt();
		int B = qq.nextInt();
		int C = qq.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
	}
}
