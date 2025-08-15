import java.util.Scanner;

 class LeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of LeftShift operator: n/ ");
        System.out.println("Please enter your number :");
        int num = input.nextInt();

        int result = num << 1;
        System.out.println("your result is : " + result);
    }
}
