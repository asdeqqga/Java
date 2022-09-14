package step01;
import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 라성준
 * 내용 : 백준 1단계 6번 문제. A/B
 */
public class _06 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double a = in.nextDouble();
		double b = in.nextDouble();
		
		in.close();
		System.out.println(a/b);
	}
}

