package Ch03;

public class P81 {
/*
 * 날짜 : 2022/08/21
 * 내용 : 조건 연산자를 사용하여 부모님의 나이 비교하기
 * 이름 : 라성준
 */
	public static void main(String[] args) {
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);
	}

}
