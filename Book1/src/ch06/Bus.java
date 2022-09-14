package ch06;

/*
 * 날짜 : 2022/08/31
 * 이름 : 라성준
 * 내용 : 버스 클래스 구현하기
 * P177
 */

public class Bus {
	int busNumber;
	int passengercount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
		
	}
	
	public void take(int money) {
		this.money += money;
		passengercount++;
		
	}
	
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은" + passengercount +"명이고, 수입은" + money + "입니다.");
		
	}

}
