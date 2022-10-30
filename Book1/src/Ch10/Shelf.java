package Ch10;

import java.util.ArrayList;
/*
 * 날짜 : 2022/10/29
 * 이름 : 라성준
 * 내용 : Shelf 클래스 만들기
 * P340
 */

public class Shelf {
	protected ArrayList<String> shelf;


	public Shelf() {
		shelf = new ArrayList<String>();

	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
	
}