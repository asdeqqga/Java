package ch05;
/*
 * 날짜 : 2022/08/24
 * 이름 : 라성준
 * 내용 : StudentTest 실행 클래스 만들기
 */

public class P146 {
	public static void main(String[] args) {
		Student studentAhn = new Student(); //Student 클래스 생성
		studentAhn.studentName = "안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
