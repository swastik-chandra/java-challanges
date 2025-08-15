import java.util.Scanner;

class Search2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to 2D search\n");
        int[][] numArr  = ArrayUtility.input2DArray();
        System.out.println(" now enter the you want to search ");
        int num =  input.nextInt();
        boolean isFound = search( numArr, num);
        if (isFound ){
            System.out.println(" your number is found .");
        }else {
            System.out.println("your number is not found. ");
        }
    }
    public static boolean search (int[][] numArr ,int num){
        int i =0 ;
        while ( i < numArr.length){
            int j =0 ;
            while (j< numArr[i].length){
                if ( numArr[i][j] == num ){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false ;
    }
}
