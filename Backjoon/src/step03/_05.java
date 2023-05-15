package step03;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2023/05/15
 * 이름 : 라성준
 * 내용 : 백준문제 3단계 5번 문제 코딩은 체육과목 입니다
 */
public class _05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N/4; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
