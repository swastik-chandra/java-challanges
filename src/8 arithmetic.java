import java.util.Scanner;

class arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Arithmetic Calculation:/n");
        System.out.println("Enter The First No: ");
        int first = input.nextInt();
        System.out.println("Noe Please Enter The Second Number:");
        int second =input.nextInt();

        int add = first + second;
        int sub = first - second ;
        int mul = first * second;
        int div = first / second ;
        int mod = first % second;

        System.out.println("The Addition is: "  + add );
        System.out.println("The subtraction is : " + sub);
        System.out.println("The multiplication is : " + mul );
        System.out.println(" The division is: " +div );
        System.out.println("The modulus is :" + mod);




    }
}
