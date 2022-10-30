package Ch10;
/*
 * 날짜 : 2022/10/22
 * 이름 : 라성준
 * 내용 : 짧은 대기열 먼저 배분하기
 * P323
 */
public class LeastJob implements Scheduler {
	@Override
	public void getNextCall() {
		System.out.println();
	}
	
	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 할당합니다.");
	}
	
}
