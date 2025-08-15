import java.util.Scanner;
class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to  Set your Password  :\n");
        String Password;
        do {
            System.out.println(" Please Enter Your Password :\n ");
            Password = input.next();
        } while(!isValidPassword(Password));
        System.out.println(" Thanks for Entering Valid Password");
    }
    public static boolean isValidPassword(String Password){
        return Password.length() > 6;
    }
}
