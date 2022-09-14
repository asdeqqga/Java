package ch01;

/*
 * 날짜 : 2022/09/13
 * 이름 : 라성준
 * 내용 : 비트 연산자 실습하기
 */
public class P73 {
	public static void main(String[] args) {
		
		byte status = 0b0110110;
		System.out.println("문열림 상태 = " +( (status & 0b00000100)!=0) );
	}
}
