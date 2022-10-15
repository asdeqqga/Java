package Ch07;

/*
 * 날짜 : 2022/09/01
 * 이름 : 라성준
 * 내용 : 객체 배열 만들기(3)
 * P209
 */
public class BookArray2 {
	public static void main(String[] args) {
		Book[] linbrary = new Book[5];
		
		linbrary[0] = new Book("태백산맥", "조정래");
		linbrary[1] = new Book("데미안" , "헤르만 헤세");
		linbrary[2] = new Book("어떻게 살 것인가", "유시민");
		linbrary[3] = new Book("토지" , "박경리");
		linbrary[4] = new Book("어린왕자", "생텍쥐페리");
				
		for(int i = 0; i < linbrary.length; i++) {
			linbrary[i].showBookInfo();
			
		}
		
		for(int i = 0; i < linbrary.length; i++) {
			System.out.println(linbrary[i]);
		}
	}
}
