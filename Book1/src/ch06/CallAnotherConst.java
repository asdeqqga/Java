package ch06;

/*
 * 날짜 : 2022/08/30
 * 이름 : 라성준
 * 내용 : this로 다른 생성자 호출하기
 * P172
 */
class Person{
		String name;
		int age;
		
		Person(){
			this("이름 없음",1);
		}
			
		Person(String name, int age){
			this.name = name;
			this.age = age; 
		}
		
		Person returnItSlef() {
			return this;	// this 반환
		}		
	}	

	public class CallAnotherConst {
		public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSlef();	 //this 값을 클래스 변수에 대입
		System.out.println(p);				 //noName.returnltSelf()의 반환 값 출력	
		System.out.println(noName);			 //참조 변수 출력
	}		
}