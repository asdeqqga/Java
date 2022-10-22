package Ch06;

/*
 * 날짜 : 2022/10/15 
 * 이름 : 라성준
 * 내용 : 학번 자동으로 부여하기
 * P184
 */
public class Student2 {
	
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public int address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
		
	}
	
	public String getstudentName() {
		return studentName;
		
	}
	
	public void setStudnetName(String name) {
		studentName = name;
	}
}
