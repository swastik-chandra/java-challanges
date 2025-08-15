import java.util.Scanner;

 class StudentScoreTernary {
    public static void main( String[] arg){
        Scanner input = new Scanner(System.in );
        System.out.println(" Welcome to  Student's Score \n");
        System.out.print( " Please enter your Marks :");
        int marks = input.nextInt();
        String category = marks > 80  ?  " high ": ( marks > 50 ? " Moderate " : " low ");
        System.out.println(" our category is : "+ category );
    }
}
