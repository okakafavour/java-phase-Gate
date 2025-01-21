public class Reverse {
	public static void main(String[] args) {
		String input = "How are you";
		String reverse = " ";
		String reversed = " ";
		for (int count = input.length() -1; count >= 0; count--) {
			reverse += input.charAt(count);
			reversed += input.charAt(1)(count);
		}
		System.out.println(reversed);
	}
}