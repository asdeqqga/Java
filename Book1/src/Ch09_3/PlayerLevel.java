package Ch09_3;

/*
 * 날짜 : 2022/09/27
 * 이름 : 라성준
 * 내용 : PlayerLever 추상 클래스 구현하기
 * P299
 */
public abstract class PlayerLevel {
	public abstract void run(); 
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {
		run();
		for(int i = 0; i < count; i++) {
			
			jump();
		}
		turn();
	}
}
