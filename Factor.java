import java.util.Scanner;
	public class Factor{
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int numb = sc.nextInt();
		
	int factor = numb;
	
	System.out.println("The factor of" + numb +" is");
	while (factor > 0){
		if (numb % factor == 0){
		System.out.println(factor)
		}
		factor--
		
		}
	}