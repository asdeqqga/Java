package Ch09;

/*
 * 날짜 : 2022/09/26
 * 이름 : 라성준
 * 내용 : 추상 클래스 테스트하기
 * P289
 *
 */
public class ComputerTest {
	public static void main(String[] args) {
		
		//Computer c1 = new Computer(); 추상 클래스는 모든 메서드가 구현되지 않았으므로 인스턴스로 생성 X
		Computer c2 = new DeskTop();
		//Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
	}
}
