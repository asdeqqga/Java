package ch06;

/*
 * 날짜 : 2022/08/31
 * 이름 : 라성준
 * 내용 : 버스와 지하철 타기
 * P178
 */

public class TakeTrans {
	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student sutdnetTomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
	}

}
