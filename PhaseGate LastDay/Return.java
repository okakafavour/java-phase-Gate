public class Return{

public static void main(String[] args) {
String name = "How are you";
String reverse = word(name);
System.out.print(reverse);
}

public static String word(String text){
	String reverse = " ";
for(int i = text.length()-1; i >= 0; i--){
	reverse += text.charAt(i);
}

	return reverse;
	}


}





