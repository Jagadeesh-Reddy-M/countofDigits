package countofDigits;

import java.util.Scanner;

public class CountofDigits {

	public static void main(String[] args) {
		boolean run = true;
		System.out.println("If you want to know how many digits in a number you want to find \n Enter the number here:");
		while(run) {
			Scanner sj = new Scanner(System.in);
			long count = 0;
			long n = sj.nextLong();
			for(long i = 1; i<=n;i++) {
				String str = String.valueOf(i);
				long len = str.length();
				count += len;
			}
			System.out.println(count);
			System.out.println("Run againg please enter yes else no");
			String s = sj.next();
			if(s.equals("yes")) {
				run = true;
				System.out.println("Enter the next Number: ");
			}else {
				run = false;
			}
			
		}

	}

}
