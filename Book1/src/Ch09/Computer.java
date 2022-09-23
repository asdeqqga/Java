package Ch09;

/*
 * 날짜 : 2022/09/19
 * 이름 : 라성준
 * 내용 : 추상 클래스 구현하기
 * P283
 */
public abstract class Computer {
	public abstract void display1();
	public abstract void typing1();
	public void turnOn() {
		System.out.println("전원을 켭니다.");
		
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

	

	public void display() {
		// TODO Auto-generated method stub
		
	}

	public void typing() {
		// TODO Auto-generated method stub
		
	}
}
