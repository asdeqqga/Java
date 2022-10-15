package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/10/15
 * 이름 : 라성준
 * 내용 : 백준 1단계 12번 문제 곱셈 
 */
public class _12 {
 public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	 
	 int abc = sc.nextInt();
	 int bef = sc.nextInt();
	 
	 int d = 5;
	 int e = 8;
	 int f = 3;
	 
	 System.out.println(abc * (bef%10));
	 System.out.println(abc * ((bef/10)%10));
	 System.out.println(abc * (bef/100));
	 System.out.println(abc * bef);
 	}
}
