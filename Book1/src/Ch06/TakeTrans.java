package Ch06;

/*
 * 날짜 : 2022/08/31
 * 이름 : 라성준
 * 내용 : 버스와 지하철 타기
 * P178
 */

public class TakeTrans {
	public static void main(String[] args) {
		/**
		 * 학생 두 명 생성
		 */
		Student studentJames = new Student("James", 5000);
		Student sutdnetTomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100); 					// 노선 번호가 100번인 버스 생성
		studentJames.takeBus(bus100);				// james가 100번 버스를 탐
		studentJames.showInfo();					// james 정보 출력
		bus100.showInfo();							// 버스 정보 출력
		
		Subway subwayGreen = new Subway("2호선");		// 노선 번호가 2호선인 지하철 생성
		sutdnetTomas.takeSubway(subwayGreen);		// Tomas가 2호선을 탐
		sutdnetTomas.showInfo();					// Tomas 정보 출력
		subwayGreen.showInfo();						// 지하철 정보 출력
	}

}
