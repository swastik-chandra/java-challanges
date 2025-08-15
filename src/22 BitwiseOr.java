import java.util.Scanner;

class BitwiseOr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing the bitwise Or operator : \n");
        System.out.println(" Enter your first number :");
        int first = input.nextInt();
        System.out.print(" Now , Enter the other number:  ");
        int second = input.nextInt();

        int result = first | second;
        System.out.println("Result is :" + result);
    }
}
