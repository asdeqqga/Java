package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/10/15
 * 이름 : 라성준
 * 내용 : 백준 1단계 10번 문제 킹 퀸 룩 비숍 나이트 폰
 */
public class _10 {
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int king = 1;
		 int queen = 1;
		 int rook = 2;
		 int bishop = 2;
		 int kinght = 2;
		 int pawn = 8;
		 
		 king = king - sc.nextInt();
		 queen = queen - sc.nextInt();
		 rook = rook - sc.nextInt();
		 bishop = bishop - sc.nextInt();
		 kinght = kinght - sc.nextInt();
		 pawn = pawn - sc.nextInt();
		 
		 System.out.print(king + " ");
		 System.out.print(queen + " ");
		 System.out.print(rook + " ");
		 System.out.print(bishop + " ");
		 System.out.print(kinght + " ");
		 System.out.print(pawn);
	}
}
