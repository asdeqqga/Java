package step02;

import java.util.Scanner;

/*
 * 날짜 : 2023/05/12
 * 이름 : 라성준
 * 내용 : 백준문제 2단계 3번 문제 윤년
 */
public class _03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        in.close();

        if(A%4==0) {
            if(A%400==0) System.out.println("1");
            else if(A%100==0) System.out.println("0");
            else System.out.println("1");
        }
        else System.out.println("0");
    }
}
