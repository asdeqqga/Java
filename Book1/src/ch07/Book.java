package ch07;

/*
 * 날짜 : 2022/09/01
 * 이름 : 라성준
 * 내용 : 객체 배열 만들기(1)
 * P207
 */
public class Book {
	private String bookName;
	private String author;
	
	public Book() {}

public Book(String bookName, String author) {
	this.bookName = bookName;
	this.author = author;
 }

public String getBookName() {
	return bookName;
	
 }

public void setBookName(String bookname) {
	this.bookName = bookName;
	
 }

public String getAuthor() {
	return author;
	
 }

public void showBookInfo() {
	System.out.println(bookName + "," + author);
 }

public void setAuthor(String string) {
	
	
}
}

