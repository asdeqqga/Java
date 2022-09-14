package sub01;

/*
 * 날짜 : 2022/08/19
 * 이름 : 라성준
 * 내용 : 자바 연산자 연습문제
 */
public class Test03 {
	public static void main(String[] args) {
		
		int result = 0;
		int unm = 1;
		
		result = unm++;
		
		System.out.println("result : "+result);
		
		result = ++unm;
		System.out.println("resul1 : "+result);
		
		result = unm--;
		System.out.println("result : "+result);
		
		result = --unm;
		System.out.println("result : "+result);
	}

}
