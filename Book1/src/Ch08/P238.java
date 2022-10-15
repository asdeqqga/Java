package Ch08;

/*
 * 날짜 : 2022/09/19
 * 이름 : 라성준
 * 내용 : protected 변수 선언
 */
public class P238 {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	private int coustomerID;
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.coustomerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
		
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

}
