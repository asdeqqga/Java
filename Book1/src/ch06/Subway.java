package ch06;

/*
 * 날짜 : 2022/08/31
 * 이름 : 라성준
 * 내용 : 지하철 클래스 구현하기
 * P177
 */

public class Subway {
	String lineNumber; 		// 버스 번호
	int passengerCount;		// 승객 수
	int money;				// 버스 수입
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	/**
	 * 지하철 노선 번호를 매개변수로 받는 생성자
	 */
	}
	
	public void take(int money) {
		this.money += money; 		//수입 증가
		passengerCount++;    		//승객 수 증가
	/**
	 * 승객이 지하철에 탄 경우를 구현한 메서드	
	 */
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "의 승객은" + passengerCount + "명이고, 수입은" + money + "입니다.");
	/**
	 * 지하철 정보를 출력하는 메서드	
	 */
	}

}
