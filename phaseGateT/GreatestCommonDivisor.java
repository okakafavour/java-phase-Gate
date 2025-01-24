// collect value for inputOne
// collect value for inputTwo
// Store the values
// check starting from one to see number in inputOne and InputTwo
// use modulus between the input and the counts to find the number than can both divide them






public class GreatestCommonDivisor{
public static void main(String[] args) {

int inputOne = 2;
int inputTwo = 24;
int result = 0;

for (int count = 1; count <= inputOne && count <= inputTwo; count++){
 if (inputOne % count == 0 && inputTwo % count == 0){
  result = count;
     }
  }
System.out.print(result);
   }

}
