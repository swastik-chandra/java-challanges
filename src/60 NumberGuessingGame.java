import java.util.Scanner;
class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num =5,guess;
        System.out.println(" Welcome to Number Guessing Game ");
        do{
            System.out.println(" Please guess the number between 0 And  10 ");
            guess = input.nextInt();
        }while (num!= guess);
        System.out.println(" You have guessed the right number ");
    }
}
