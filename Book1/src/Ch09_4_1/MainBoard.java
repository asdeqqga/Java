package Ch09_4_1;

import Ch09_3.Player;

/*
 * 날짜 : 2022/09/28
 * 이름 : 라성준
 * 내용 : 테스트 코드(최종 실행 파일)부터 만들기
 */
public class MainBoard {
	public static void main(String[] args) {
		
		Player player = new Player();
	    player.player(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}
}
