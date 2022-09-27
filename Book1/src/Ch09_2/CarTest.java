package Ch09_2;

/*
 * 날짜 : 2022/09/26
 * 이름 : 라성준
 * 내용 : 추상 클래스와 템플릿 메서드
 */
public class CarTest {
	public static void main(String[] args) {
		System.out.println("=== 자율 주행하는 자동차 ===");
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		Car hisCar = new ManualCar();
		hisCar.run();
	}
}
