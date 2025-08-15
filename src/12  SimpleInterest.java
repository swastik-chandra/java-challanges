import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to simple Interest Calculation");
        System.out.println("Please Enter Your Principle Amount Rs ");
        int principle = input.nextInt();
        System.out.println("Now ,Tell me your Rate of Interest: ");
        float rate = input.nextFloat();
        System.out.println("Now , Tell me for how many years are you borrowing this money ");
        float years = input.nextFloat();

        float Interest = (principle * rate * years)/100 ;
        System.out.println("\n\n your Simple Interest is Rs " + Interest );
    }
}
