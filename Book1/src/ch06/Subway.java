package ch06;

/*
 * 날짜 : 2022/08/31
 * 이름 : 라성준
 * 내용 : 지하철 클래스 구현하기
 * P177
 */

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
		
	}
	
	public void take(int money) {
		this.money += money; //수입 증가
		passengerCount++;    //승객 수 증가
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "의 승객은" + passengerCount + "명이고, 수입은" + money + "입니다.");
	}

}
