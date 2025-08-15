import java.util.Scanner;

class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to Perimeter Calculation ");
        System.out.println("Please Enter all 4 sides in cms: " );
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();
        double d = input.nextInt();
        double Perimeter = a + b + c + d;
        System.out.println("Perimeter of your Rectangle is : " +  Perimeter  + " cms ");
    }
}
