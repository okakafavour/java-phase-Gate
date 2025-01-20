import java.util.Scanner;
	public class palindrome {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter three digit number ");
			int numb = sc.nextInt();
			
			int number = numb % 10;
			numb /= 10;
			
			if (number == number) {
			System.out.println("True");
			} else if (number != number) {
				System.out.println("False");
			
			}
		}
	}	
