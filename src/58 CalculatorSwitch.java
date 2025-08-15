import java.util.Scanner;

class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to calculator \n");
        System.out.println(" Please ,enter your first number: ");
        int num1 = input.nextInt();
        System.out.println(" then enter your second number :");
        int num2 = input.nextInt();
        System.out.println("Now Enter the Operation:");
        String operation = input.next();
        int result = Switch  ( operation );{
            String s;= "+";
            case1  -> {
            }
            cas2  "-" -> {
            }
            case3  "*" -> {
            }
            case4  "/" -> {
            }
            default -> -1 ;
        };
        System.out.println(" Your answer is " + result);
    }
}
