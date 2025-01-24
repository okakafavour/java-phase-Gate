import java.util.Arrays;
 public class Max {
 public static void main(String[] args){

  int[] numbers ={2,4,15,6,7,9,10};
numbers(numbers);
    }
   public static void numbers(int[] numbers) {
	
   int firstMax = 0;
   int secondMax = 0;
  
 for (int i = 0; i < numbers.length; i++){

    if (numbers[i] > firstMax) {
	secondMax = firstMax;
         firstMax = numbers[i];

      } else if (numbers[i] > secondMax && numbers[i] != firstMax){
	secondMax = numbers[i];
}

   }
    System.out.println(firstMax);
    System.out.println(secondMax);
}
 }