import java.util.Scanner;

 class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Even Calculator :");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("your number is an even number .");
        } else {
            System.out.println("your number is Odd number. ");
        }
    }
}