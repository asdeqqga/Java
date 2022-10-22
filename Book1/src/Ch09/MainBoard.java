package Ch09;

/*
 * 날짜 : 2022/09/27
 * 이름 : 라성준
 * 내용 : 테스트 프로그램 실행하기
 * P303
 */
public class MainBoard {
	public static void main(String[] args) {
		
		Player player = new Player();
	    player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}
}
