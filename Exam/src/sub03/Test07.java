package sub03;

/*
 * 날짜 : 2022/09/02
 * 이름 : 라성준
 * 내용 : 클래스 상속 연습문제
 */
class Customer {
	private int id;
	private String name;
	private String grade;
	private int point;
	private double pointRatio;
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		this.grade = "SILVER";
		this.point = 100;
		this.pointRatio = 0.01;
		
	}
	
	public int calcPrice(int price) {
		point += price * pointRatio;
		return price;
		
	}
	
	public void showInfo() {
		System.out.println("=================");
		System.out.println("고객번호 : "+id);
		System.out.println("고객이름 : "+name);
		System.out.println("고객등급 : "+grade);
		System.out.println("현재 포인트 :"+point);
		System.out.println("포인트 적립율 :"+pointRatio);
		System.out.println("------------------");
	}
}
