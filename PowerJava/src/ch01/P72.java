package ch01;

/*
 * 날짜 : 2022/09/13
 * 이름 : 라성준
 * 내용 : 관계 연산자 실습하기
 */
public class P72 {
	public static void main(String[] args) {
		System.out.println((3 == 4) + " ");
		System.out.println((3 != 4) + " ");
		System.out.println((3 > 4) + " ");
		System.out.println((3 < 4) + " ");
		
		System.out.println((3 == 3 && 4 == 7) + " "); // 하나만 거짓이면 전체가 거짓
		System.out.println((3 == 3 || 4 == 7) + " "); // 하나만 참이면 전체가 참
	}
}
