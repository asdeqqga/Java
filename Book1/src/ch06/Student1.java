package ch06;

/*
 * 날짜 : 2022/10/15 
 * 이름 : 라성준
 * 내용 : static 변수 사용하기
 * P182
 */
public class Student1 {
	
	public static int serialNum = 1000; // static 변수는 인스턴스 생성과 상관 없이 먼저 생성됨
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public String getstudentName() {
		return studentName;
		
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
