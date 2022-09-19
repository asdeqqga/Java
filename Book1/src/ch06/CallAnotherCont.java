package ch06;
/*
 * 날짜 : 2022/08/31
 * 이름 : 라성준
 * 내용 : this를 사용하여 주소 값 반환하기
 * P173
 */

class Person {
	String name;
	int age;
	
	Person(){
		this("이름 없음", 1);
		
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this; //this 반환
	}

}

   public class callAnotherConst {
	public static void main(String[] args) {
		
			Person noName = new Person();
			System.out.println(noName.name);
			System.out.println(noName.age);
			
			Person p = ((Person) noName).returnItSelf(); //this 값을 클래스 변수에 대입
			System.out.println(p);			  //noName.returnltSelf()의 반환 값 출력	
			System.out.println(noName);       //참조 변수 출력
		
	}
}
