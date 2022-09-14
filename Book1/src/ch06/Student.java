package ch06;

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
    
}

public void takeBus(Bus bus) {
	bus.take(1000);
	this.money -= 1000;
	
}

public void takesubway(Subway subway) {
	subway.take(1500);
	this.money -= 1500;
	
}

public void showInfo() {
	System.out.println(studentName + "님의 남은 돈은" + money +"입니다.");
 }

public void takeSubway(Subway subwayGreen) {
	
	
}
}
