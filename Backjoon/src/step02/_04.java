package step02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2023/05/12
 * 이름 : 라성준
 * 내용 : 백준문제 2단계 4번 문제 사분면 고르기
 */

public class _04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        System.out.println((x>0&&y>0 ? 1 : (x<0&&y>0) ? 2 : (x<0&&y<0) ? 3 : 4));
    }
}
