package Ch06;

/*
 * 날짜 : 2022/08/31
 * 이름 : 라성준
 * 내용 : 학생 클래스 구현하기
 * P175
 */
public class Student {
	public String studentName;  //학생 이름
	public int grade;			//학년	
	public int money;			//학생이 가지고 있는 돈

public Student(String sutdentName, int money) {
	this.studentName = studentName;
    this.money = money;
    /**
     * 학생 이름과 가진 돈을 매개변수로 받는 생성자	
     */    
}

public void takeBus(Bus bus) {
	bus.take(1000);
	this.money -= 1000;
	/**
	 * 학생이 버스를 타면 1,000원을 지불하는 기능을 구현한 메서드	
	 */
}

public void takesubway(Subway subway) {
	subway.take(1500);
	this.money -= 1500;
	/**
	 * 학생이 지하철을 타면 1,500원을 지불하는 기능을 구현한 메서드
	 */
}

public void showInfo() {
	System.out.println(studentName + "님의 남은 돈은" + money +"입니다.");
	/**
	 * 학생의 현재 정보를 출력하는 메서드
	 */
 }

public void takeSubway(Subway subwayGreen) {
	
	
	}
}
