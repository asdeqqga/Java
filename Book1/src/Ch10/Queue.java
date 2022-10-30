package Ch10;
/*
 * 날짜 : 2022/10/29
 * 이름 : 라성준
 * 내용 : Queue 인터페이스 정의하기
 * P341
 */

public interface Queue {
	void enQueue(String title); // 배열의 맨 마지막에 추가
	String deQueue();			// 배열의 맨 처음 항목 변환
	int getSize();				// 현재 Queueu에 있는 개수 반환
}
