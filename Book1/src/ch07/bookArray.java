package ch07;

/*
 * 날짜 : 2022/09/01
 * 이름 : 라성준
 * 내용 : 객체 배열 만들기(2)
 * P208
 */
public class bookArray {
	public static void main(String[] args) {
		Book[]library = new Book[5];
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}
}
