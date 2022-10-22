package Ch10;

/*
 *날짜 : 2022/10/22
 *이름 : 라성준 
 *내용 : 우선순위에 따라 배분하기
 *P323
 */
public class PriorityAllocation implements Scheduler {
	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skill 값이 높은 상담원에게 우선적으로 배분합니다.");
		
	}

}
