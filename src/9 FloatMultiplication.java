import java.util.Scanner;

class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" We are doing FloatMultiplication: /n");
        System.out.println("Please Enter The First Decimal  Number : ");
        double  first= input.nextDouble();
        System.out.println( " please enter second decimal no:");
        double second = input.nextDouble();
        double mul = first * second ;
        System.out.println(" \n  Result is : "  +mul );
    }
}
