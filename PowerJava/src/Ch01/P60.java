package ch01;

/*
 * 날짜 : 2022/09/02
 * 이름 : 라성준
 * 내용 : 1광년 거리 계산하기
 */
public class P60 {
	public static void main(String[] args) {
	final double LIGHT_SPEED =3e5;
	double disatance;
	
	disatance = LIGHT_SPEED * 365 * 24 * 60  * 60;
	System.out.println("빛이 1년 동안 가는 거리 : " + disatance + "km.");
 }
}