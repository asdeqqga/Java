package Ch08;

/*
 * 날짜 : 2022/09/19
 * 이름 : 라성준
 * 내용 : VIPCunstmoer 클래스 구현하기
 * P237
 */
public class VIPCustomer extends Customer {
	private int agenID; // VIP 고객 상담원 아이디
	double saleRatio;   // 할인율
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.01;
	}
	
	public int getAgentID() {
		return agenID;
		
	}

	public void setCustomerID(int i) {
		
		
	}
}
