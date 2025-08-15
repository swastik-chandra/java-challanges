import java.util.Scanner;

class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Age Calculator :");
        int age = input.nextInt();
        if ( age >= 60 ){
            System.out.println(" you are senior citizen.");

        }else if ( age >= 20 ){
            System.out.println("you are an adult. ");

        }else if ( age >= 13){
            System.out.println("you are teenager.");

        }else {
            System.out.println("you are child. ");

        }

    }
}
