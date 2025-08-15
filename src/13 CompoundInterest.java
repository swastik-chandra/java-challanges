import java.awt.geom.Arc2D;
import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to compound interest calculator. \n");
        System.out.println("please enter your principle amount Rs :");
        int principle = input.nextInt();
        System.out.println("Now , Tell me your rate of interest : ");
        float rate = input.nextInt();
        System.out.println("Now , tell me for how many year are you borrowing this money :");
        float years = input.nextFloat();
        double comInt = principle * Math.pow((1 + rate / 100),years);
        System.out.println(" Your compound interest is: " + comInt);






    }
}