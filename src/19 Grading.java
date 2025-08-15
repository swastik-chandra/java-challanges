import java.util.Scanner;

 class Grading {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Grading Calculation .\n");
         System.out.println("Please enter your percentage: ");
         float percentage = input.nextFloat();

         if (percentage >= 90) {
             System.out.println("Great , you have got A");

         } else if (percentage >= 75) {
             System.out.println("Good , you have got B");

         } else if (percentage >= 60) {
             System.out.println("you have got C . work harder next time ");

         } else if (percentage >= 30) {
             System.out.println(" you have got B .  seriously you have to work harder ");


         }else {
             System.out.println(" you have got F . you have failed the exam ");
         }
     }
 }