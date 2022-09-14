package test;

public class For5 {
   public static void main(String[] args) {
	   int num = 1;
	   
	   for(int i = 0; i < 5; i++) {
		   for(int k = 4; k > i; k--) {
			   System.out.print("☆");
			   
		   }
		   for(int j = 0; j < num; j++) {
			   System.out.print("★");
		   }
		   num = num +2;
		   System.out.println();
	   }
   }
}