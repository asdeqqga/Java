package step01;
import java.util.Scanner;
/*
 * 날짜 : 2022/09/07
 * 이름 : 라성준
 * 내용 : 백준 1단계 7번 문제. 사칙연산
 */

public class _07{
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int A = in.nextInt();
	int B = in.nextInt();

    in.close();

	System.out.println(A+B);
	System.out.println(A-B);
	System.out.println(A*B);
	System.out.println(A/B);
	System.out.println(A%B);
 }
}
