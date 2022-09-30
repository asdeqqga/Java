package Ch10_2;

/*
 * 날짜 : 2022/09/30
 * 이름 : 라성준
 * 내용 : 순서대로 배분하기
 */
public class RoundRobin implements Scheduler {

	@Override
	public void getNerxCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
		
	}	
}
	
	