package ch05;
/*
 * 내용 :2022/08/23
 * 이름 : 라성준
 * 내용 :Student 클래스에 main()함수 추가하기
 */


public class P144 {
	int studentID;
	String studentName;
	int grade;
	String address;
	
public String getStudentName() {
	return studentName;
}

public static void main(String[] args) {
	Student studentAhn = new Student(); //Student 클래스 생성
	studentAhn.studentName = "안연수";
	
	System.out.println(studentAhn.studentName);
	System.out.println(studentAhn.getStudentName());
 }
}
