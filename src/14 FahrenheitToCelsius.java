import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Temperature convertor  ");
        System.out.println("Enter your temp in F :");
        float fah = input.nextFloat();
        float cel =(fah - 32) * 5/9 ;
        System.out.println("your temperature is : " + cel +"c" );

    }
}
