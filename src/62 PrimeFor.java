import java.util.Scanner;

class PrimeFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to Prime Number Checker :");
        System.out.println("Please enter the number :  ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        System.out.println("your number is " +
                (isPrime ? "prime":"not prime"));
    }
    public static boolean isPrime(int num){
        for ( int i = 2 ; i < num ;i++ ){
            if ( num % i== 0 ){
                return false ;
            }
        }
        return true  ;
    }
}
