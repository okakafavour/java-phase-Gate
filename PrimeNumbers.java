import java.util.Scanner;
 public class PrimeNumbers {
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter primeNumber: ");
		int number = sc.nextInt();
		
		int result = 0;
		result = number / number;
		if (result == 1) {
		System.out.println("True");
		} else if (result != 1);
			System.out.println("False");
		}
	}
 }