package ch06;

/*
 * 날짜 : 2022/08/31
 * 이름 : 라성준
 * 내용 : 버스 클래스 구현하기
 * P177
 */

public class Bus {
	int busNumber;       // 버스 번호
	int passengerCount;  // 승객 수
	int money;           // 버스 수입
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
		
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
		
	}
	
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은" + passengerCount +"명이고, 수입은" + money + "입니다.");
		
	}

}
