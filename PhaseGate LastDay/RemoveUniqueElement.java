public class RemoveUniqueElement {
    public static void main(String[] args) {
        int[] input = {-1, 2, 3,3, 0,8,7,8,0};
        NonUniqueElements(input);
    }

    public static void NonUniqueElements(int[] input) {
        for (int count = 0; count < input.length; count++) {
            int store = 0;
            
            for (int count2 = 0; count2 < input.length; count2++) {
                if (input[count] == input[count2]) {
                    store++;
                }
            }
            
            if (store == 1) {
                System.out.print(input[count] + " ");
            }
        }
    }
}
