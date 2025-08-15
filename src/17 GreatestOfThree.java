import java.util.Scanner;

 class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to The world of three ./n");
        System.out.println(" Please Enter your first number: ");
        int first = input.nextInt();
        System.out.println("Please enter your second number :");
        int second = input.nextInt();
        System.out.println("Finally ,  Enter your third number ;");
        int third = input.nextInt();
        if (first >= second && first >= third) {
            System.out.println(first + "  is the greatest number ");

        } else if (second >= third) {
            System.out.println(second + "  is the greatest number ");

        } else {
            System.out.println(third  + "  is the greatest number ");
        }
    }
}