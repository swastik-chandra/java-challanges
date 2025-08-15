import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of elements:");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Please enter element " + (i + 1) + ":");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }

    public static void displayArray(int[] numArray) {
        int i = 0;
        while (i < numArray.length) {
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);

        // Get the dimensions of the 2D array
        System.out.println("Please enter the number of rows:");
        int rows = input.nextInt();
        System.out.println("Please enter the number of columns:");
        int cols = input.nextInt();

        // Initialize the 2D array with the given dimensions
        int[][] nums = new int[rows][cols];

        // Populate the 2D array with elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Please enter element at (" + (i + 1) + ", " + (j + 1) + "):");
                nums[i][j] = input.nextInt();
            }
        }

        return nums;
    }
}
