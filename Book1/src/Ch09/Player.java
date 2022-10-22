package Ch09;
/*
 * 날짜 : 2022/09/27
 * 이름 : 라성준
 * 내용 : Player 클래스 구현하기 
 * P299
 */


public class Player {
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}

