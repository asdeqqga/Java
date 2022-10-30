package Ch10;
/*
 * 날짜 : 2022/10/29
 * 이름 : 라성준
 * 내용 : BookShelf 클래스 만들기
 * P341
 */
public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

}