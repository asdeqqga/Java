package ch08;

/*
 * 날짜 : 2022/09/19
 * 이름 : 라성준
 * 내용 : 상속 클래스 테스트하기
 */
public class P239 {
	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerName(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerID("김유신");
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
	}
}
