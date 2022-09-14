package sub5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * 날짜 : 2022/09/08
 * 이름 : 라성준
 * 내용 : 날짜 클래스 실습하기
 */
public class DateTest {
	public static void main(String[] args) {
		
		//Date 클래스
		Date date = new Date();
		System.out.println("date : " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result = sdf.format(date);
		
		System.out.println("result : " + result);
		
		// Calendar 클래스
		//Calendar ca1 = new Calendar();
		Calendar ca1 = Calendar.getInstance();
		
		int y = ca1.get(Calendar.YEAR);
		int m = ca1.get(Calendar.MONTH) + 1;
		int d = ca1.get(Calendar.DATE);
		int hour = ca1.get(Calendar.HOUR);
		int min = ca1.get(Calendar.MINUTE);
		int sec = ca1.get(Calendar.SECOND);
		
		System.out.printf("%d-%d-%d %d:%d:%d" ,y ,m ,d ,hour ,min ,sec);
	}
}
