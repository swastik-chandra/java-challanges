import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to triangle area calculator: /n");
        System.out.println("Please enter your base in cms :");
        double base = input.nextInt();
        System.out.print("Now Enter The Perpendicular  height In cms : ");
        double height = input.nextInt();
        double area = ( base * height )/2;
        System.out.println("The Area Of  The Triangle Is :" + area + " cm2");
    }
}
