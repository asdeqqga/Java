package Ch06;

/*
 * 날짜 : 2022/10/15
 * 이름 : 라성준
 * 내용 : P183
 */
public class StudentTest1 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum); // serialNum 변수의 초깃값 출력
		studentLee.serialNum++;
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	}
}
