package step02;

import java.util.Scanner;
/*
 * 날짜 : 2023/05/15
 * 이름 : 라성준
 * 내용 : 백준문제 2단계 6번 문제 오븐 시계
 */
public class _06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        int min = 60 * A + B;
        min += C;

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour +" "+minute);
    }
}
