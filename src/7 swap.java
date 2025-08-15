import java.sql.SQLOutput;
import java.util.Scanner;

class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to swap station/n/n");
        System.out.println("Enter Value Of A. ");
        int a = input.nextInt();
        System.out.println("Enter Value Of B. ");
        int b =input.nextInt();

        int c = a;
        a = b;
        b = c ;
        System.out.println("swap is done....");

        System.out.println("Value of swap A is ." + a);
        System.out.println("Value of swap B is ." + b);





    }
}
