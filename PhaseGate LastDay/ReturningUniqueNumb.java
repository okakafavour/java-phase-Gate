import java.util.Arrays;
public class uniqueNumbers{
	
	public static void main(String[] args) {
		int[] array ={1,2,3,4,3};
		 findUniqueNumbers(array);
                 int result = 0;
		System.out.println(result);
	}	
	
	public static int findUniqueNumbers(int[]array) {
	      int result = 0;
	for (int count = 1; count < array.length; count++) {
	  for (int counter = 0; counter < array.length; counter++){
		if (count != counter && array[counter] == array[count]) {
               result = array[count];
                      
        }
			
    }
    
    }
   return result;
  } 
}