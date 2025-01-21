public class Array{
	public static void main(String[] args) {
		String input = "ABCD";
		String reverse = " ";
	
	for (int count = input.length() -1; count >= 0; count--) {
		reverse += input.charAt(count);
	}
		System.out.println(reverse);
		}
	}