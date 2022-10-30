package Ch10;
/*
 * 날짜 : 2022/10/29
 * 이름 : 라성준
 * 내용 : BookShelf 테스트하기
 * P342
 */
public class BookShelfTest {
	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		
		shelfQueue.enQueue("태백산맥 1");
		shelfQueue.enQueue("태백산맥 2");
		shelfQueue.enQueue("태백산맥 3");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}
}
