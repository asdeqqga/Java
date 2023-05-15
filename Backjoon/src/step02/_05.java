package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 날짜 : 2023/05/12
 * 이름 : 라성준
 * 내용 : 백준문제 2단계 5번 문제 알람시계
 */
public class _05 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        br.close();

        StringBuilder sb = new StringBuilder();

        if (m < 45) {
            if (h == 0) {
                h = 23;
                sb.append(h).append(" ");
            } else {
                h--;
                sb.append(h).append(" ");
            }
            sb.append(m = 60 - (45 - m));
        } else {
            sb.append(h).append(" ").append(m - 45);
        }
        System.out.println(sb);
    }
}
