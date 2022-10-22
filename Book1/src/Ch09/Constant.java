package Ch09;

/*
 * 날짜 : 2022/09/27
 * 이름 : 라성준
 * 내용 : final 실습하기
 * P305
 */
public class Constant {
	
	int num = 10;
	final int NUM = 100;
	
	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num = 50;
		cons.num = 200;
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}
}
