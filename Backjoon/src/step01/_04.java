package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 라성준
 * 내용 : 백준 1단계 4번 문제. A-B
 */
public class _04 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
   
        while(num1<=0 || num1>=10 || num2<=0 || num2>=10) {
            
            System.out.println("입력받는 수는 0과 10사이여야 합니다.");
            num1 = scan.nextInt();
            num2 = scan.nextInt();            
        }
        
        System.out.println(num1-num2);
    }
}