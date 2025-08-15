import java.util.Scanner;

class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of Not / compliment operator: n/ ");
        System.out.println("Please enter your number :");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("your result is : " + result);
    }
}
