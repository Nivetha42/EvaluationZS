import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		System.out.println("Enter the Character range (A-Z)");
		Scanner sc=new Scanner(System.in);
		char f=sc.next().charAt(0);
		int n;
//		char f='F';
		n=((int)f-65)+1;
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= n; j++) {
				
				if (i != 1 && i + j == n + 1) {
					System.out.print((char)(i+65-1));
				} else {
					System.out.print(" ");
				}
			}

			for (int j = 1; j <= n; j++) {
				if (i == j) {
					System.out.print((char)(i+65-1));
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		for (int i = n; i >0; i--) {

			for (int j = n; j>0; j--) {
				if (i != 1 && i==j) {
					System.out.print((char)(i+65-1));
				} else {
					System.out.print(" ");
				}
			}
			for (int j = n; j >0; j--) {
				if ( i + j == n + 1) {
					System.out.print((char)(i+65-1));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
