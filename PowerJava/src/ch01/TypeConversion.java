package ch01;

/*
 * 날짜 : 2022/09/02
 * 이름 : 라성준
 * 내용 : 형변환 실습하기
 * P62
 */

public class TypeConversion {
	public static void main(String args []) {
		int i;
		double f;
		
		f = 1 / 5;
		System.out.println(f);
		
		f = (double) 1 / 5;
		System.out.println(f);
		
		i = (int) 1.7 + (int) 1.8;
		System.out.println(i);
	}

}
