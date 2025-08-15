import java.util.Scanner;

class OddEvenBitwise {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to odd / even calculator .");
         System.out.println("please enter your number :");
         int num = input.nextInt();

         if (( num & 1) == 1 ){
             System.out.println("your number is odd ");
         } else {
             System.out.println(" your number is even ");

         }

     }
}
