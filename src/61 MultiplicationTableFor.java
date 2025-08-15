import java.util.Scanner;
 class MultiplicationTableFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome To Multiplication table \n ");
        System.out.println(" Please enter your number you want to print table of :" );
        int num = input.nextInt();

        for( int i= 1 ; i <= 10 ; i++){
            System.out.println(num +" X " +i + " = "+ (num * i));
        }
    }
}
