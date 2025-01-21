public class RemoveArray {

public static void main(String[] args){

int[] array = {2,2,3,4,5,2,7};
int remove = 2;

for (int count = 0; count < array.length; count++){
    if (array[count] == remove){
	continue;

			}
System.out.print(array[count]);
		}
	}
}