import java.util.Scanner;

class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverse the digits world .");
        System.out.println(" please enter your number  : ");
        int num = input.nextInt();
        int reverse = Reverse( num );
        System.out.println(" Reverse of your number is " + reverse);

    }
    public static int Reverse( int num ){
        int newNum = 0 ;
        while( num > 0 ){
            int digit = num % 10 ;
            newNum = newNum *10 + digit ;
            num /=10 ;

        }
        return newNum;
    }
}
