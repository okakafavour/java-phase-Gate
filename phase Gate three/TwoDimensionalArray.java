import java.util.Arrays;
	public class TwoDimensionalArray{
		public static void main(String[] args) {
		int[][] array ={{1,2,3}, {4,5,6}};
		 int [][] array = new int[1][2];
			
		int row = 0;
		int colomn = 0;
		for(int row = 0; row < array.length; row++){
			for (int colomn = 0; column < array[row].length; column++){
			
				System.out.print(array[row][column] + " ");
			}
			System.out.println(array);
			}
		}
	}
		
	