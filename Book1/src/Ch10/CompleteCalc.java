package Ch10;

/*
 * 날짜 : 2022/09/28
 * 이름 : 라성준
 * 내용 : 계산기 클래스 만들기
 * P317
 */
public class CompleteCalc {
	
	public int times(int num1, int num2) {
		return num1 * num2;
	}
	
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1/num2;
		else
			return Calc.ERROR; // num2가 0, 즉 나누는 수가 0인 경우에 대해 오류 반환
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다"); // CompleteCal에서 추가로 구현환 메서드
	}

	public char[] substract(int num1, int num2) {
		return null;
	}

	public char[] add(int num1, int num2) {
		return null;
	}
}
