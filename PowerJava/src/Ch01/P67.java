package ch01;

import java.util.*;
/*
 * 날짜 : 2022/09/02
 * 이름 : 라성준
 * 내용 : 사용자로부터 이름과 나이를 받는 프로그램
 */
public class P67 {
	public static void main(String args[]) {
		
		String name;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오: 홍길동");
		name = sc.nextLine();
		System.out.print("나이를 입력하시오: 24");
		age = sc.nextInt();
		
		System.out.println(name + "님 안녕하세요! " + (age) + "살이시네요.");
	}

}
