import java.util.Scanner;

 class welcome {
    public static void main(String[] args) {
        System.out.println(" Please enter your name :");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Welcome " + name +" to  the Charak hostel ");
    }
}
