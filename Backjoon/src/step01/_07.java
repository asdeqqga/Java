package step01;
import java.util.Scanner;
/*
 * 날짜 : 2022/09/07
 * 이름 : 라성준
 * 내용 : 백준 1단계 7번 문제. 사칙연산
 */

public class _07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(1<=a && b<=10000) {
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
		}else {
			System.out.println("1<=a && b<=10000 범위이내로 설정하세요.");
		}
 }
}