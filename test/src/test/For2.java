package test;

public class For2 {
	public static void main(String[] args) {
		for(int i = 0; i < 6; i++) {
			for(int j = 5; j > 0; j--) {
				if(i < j) {
					System.out.print(" ");
				}else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
