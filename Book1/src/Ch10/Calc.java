package Ch10;

/*
 * 날짜 : 2022/09/28
 * 이름 : 라성준
 * 내용 : Calc 인터페이스 만들기, P315
 * 		Calc 인터페이스에 디폴트 메서드 구현하기
 * 		정적 메서드 구현하기, P330
 * 		Calc 인터페이스에 private 메서드 구현하기, P332
 */
public interface Calc {
	double PI = 3.14;			// 인터페이스에서 선언한 변수는 컴파일 과정에서			
	int ERROR = -999999999; 	// 상수로 변환됨 
	
	int add(int num1, int num2);
	int substract(int num1, int num2); 	//인터페이스에서 선언한 메서드는 컴파일 과정에서
	int times(int num1, int num2);		// 추상 메서드로 변환됨
	int divide(int num1, int num2);
	
	// 디폴트 메서드
	default void description() {
		System.out.println("정수 계산기를 구현합니다");
		myMethod();
	}
		
		static int total(int[] arr) {
			int total = 0;
			
			for(int i : arr) {
				total += i;
			}
			return total;
		
	}
	
	private void myMethod() {
		System.out.println("private 메서드입니다.");
	}	
	
	private static void myStaticMethod() {
		System.out.println("private static 메서드입니다.");
	}
}
