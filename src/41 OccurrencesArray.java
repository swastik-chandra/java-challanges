import java.util.Scanner;

class OccurrencesArray {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Array Occurrences /n");
         int[] numArr = ArrayUtility.inputArray();
         System.out.println(" Now enter number you want to find ");
         int num = input.nextInt();
         int Occurrences = noOfOccurrences(numArr, num);
         System.out.println("Your element is found " +  Occurrences + " times in the Array");


     }
     public static int noOfOccurrences(int[] numArr , int num){
         int occ = 0 ;
         int i = 0;
         while (i < numArr.length){
             if (numArr[i] == num){
                 occ++;

             }
             i++;

         }
         return occ;
     }

}
