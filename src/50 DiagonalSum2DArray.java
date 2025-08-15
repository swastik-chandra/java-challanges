class DiagonalSum2DArray {
    public static void main(String[] args) {
        System.out.println(" welcome to Diagonal sum");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = SumOfDiagonals(numArr);
        System.out.println(" Sum of diagonals is : " + sum );

    }
    public static long  SumOfDiagonals(int[][] numArr){
        long leftSum = SumOfLeftDiagonal(numArr);
        long rightSum =SumOfRightDiagonal(numArr);
        long sum = leftSum + rightSum;
        if (numArr.length % 2 !=0){
            int ind = numArr.length / 2 ;
            sum -= numArr[ind][ind];
        }

        return sum;

    }
    public static long SumOfLeftDiagonal(int[][] numArr){
        long sum = 0;
        int i= 0;
        while (i < numArr.length){
            sum += numArr[i][i];
            i++;

        }
        return sum;

    }
    public static long  SumOfRightDiagonal(int[][] numArr){
        long sum = 0 ;
        int i = 0;
        while ( i < numArr.length ){
            int col =  numArr.length - 1 - i ;
        sum += numArr[i][col];
        i++;
        }
        return sum;

    }
}
