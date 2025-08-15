import java.util.Scanner;

 class Sum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to our calculator ");
        System.out.print(" Please enter first number: ");
        int firstNum = input.nextInt();
        System.out.print("Now, enter the second number : ");
        int secondNum = input.nextInt();
        int Sum = firstNum + secondNum;
        System.out.println(" Sum of number is :"+ Sum);
    }
}
