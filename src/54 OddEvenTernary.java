import java.util.Scanner;

class OddEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );
        System.out.println(" Welcome to  Odd or Even Ternary \n");
        System.out.print( " Please enter your number :");
        int num = input.nextInt();
        String result = num % 2 == 0 ? " even ": " odd";
        System.out.println(" your number is : " +  result );
    }
}
