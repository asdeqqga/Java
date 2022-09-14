package ch07;

import java.util.ArrayList;

import javax.security.auth.Subject;

/*
 * 날짜 : 2022/09/01
 * 이름 : 라성준
 * 내용 : Student 클래스 구현하기
 * P227
 */

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;  // ArrayList 선언하기

public Student(int studnetID, String studentName,) {
	this.studentID = studnetID;
	this.studentName = studentName;
	subjectList = new ArrayList<Subject>();  // ArrayList 생성하기
	
}

public void addSubject(String name, int score) {
	Subject subject = new Subject();  // Subject 생성하기
	Subject.setName(name);            // 과목 이름 추가하기
	Subject.setScorePoint(score);     // 점수 추가하기
	SubjectList.add(subject);         // 배열에 저장하기
}

public void showStudentInfo() {
	// TODO Auto-generated method stub
	
}
}
