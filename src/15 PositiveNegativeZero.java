import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number checker n/");
        System.out.println("please enter your number");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println("Your Number Is Positive ");
        } else if (num == 0) {
            System.out.println(" Your Number Is Zero");
        } else {
            System.out.println("Your number is Negative ");
        }
    }
}