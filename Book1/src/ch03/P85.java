package ch03;

public class P85 {
/*
 * 날짜 : 2022/08/21
 * 내용 : 비트 이동 연산자를 사용하여 연산하기
 * 이름 : 라성준
 */
	public static void main(String[] args) {
		int num = 0B0000101;
		
		System.out.println(num << 2);
		System.out.println(num >> 2);
		System.out.println(num >>> 2);
		
		System.out.println(num);
		
		num = num << 2;
		System.out.println(num);
	}
}
