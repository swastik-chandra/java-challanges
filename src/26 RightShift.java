import java.util.Scanner;

class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of RightShift operator: n/ ");
        System.out.println("Please enter your number :");
        int num = input.nextInt();

        int result = num >>4;
        System.out.println("your result is : " + result);
    }
}
