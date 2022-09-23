package ch08;

/*
 * 날짜 : 2022/09/02
 * 이름 : 라성준
 * 내용 : Customer
 * P234
 */

public class Customer {
	private int customerID;
	private String customerName;
	public String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
		
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며 , 보너스 포인트는" + bonusPoint + "입니다.";
		
	}

	public void setCustomerID(String string) {
		
		
	}

	public void setCustomerName(String string) {
		
		
	}

	public void setCustomerName(int i) {
		
		
	}
	

}
