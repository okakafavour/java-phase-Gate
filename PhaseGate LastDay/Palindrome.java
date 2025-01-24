public class Palindrome {
 public static void main(String[] args){

   String input = "121";
   String reverse = words(input);
   String forward = words(input);
   System.out.println(reverse);
     }
	public static String words(String input){
           String reverse = " ";
       for (int count = input.length()-1;  count >0; count--){
           reverse += input.charAt(count);
        for (int counter = 0; counter < input.length; count++){
             forward += input.charAt(counter);

           if (reverse == forward) {
         
           result = ("True");
         }  else if (reverse != foward) { 
               result = ("False");
    }
 }     
     
                
    }

}
  }





