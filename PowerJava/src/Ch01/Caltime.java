package ch01;
import java.util.Scanner;
public class Caltime {
/*
 * 날짜 : 2022/09/02
 * 이름 : 라성준
 * 내용 : 형변환 실습하기
 * P70
 */

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("초를 입력하시오:310");
	int time = sc.nextInt();
	int sec = (time%60);    // 나머지 연산자를 이용한다.
	int min = (time/60);	// 정수 나눗셈을 이용한다.
	
	System.out.println(time +"초는 " + min + "분" + sec + "초입니다.");
 }

}
