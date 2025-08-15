 class IsSortedArray {
    public static void main(String[] args) {
        System.out.println(" Welcome to Array check post\n");
        int[] numArr = ArrayUtility.inputArray();
        Boolean isInc = isIncreasing(numArr);
        Boolean isDec = isDecreasing(numArr);
        if( isInc || isDec) {

            System.out.println("Your Array is sorted");
        }else{
            System.out.println("Your Array is  not sorted");
        }
    }
    public static boolean isDecreasing(int[] numArr){
        int i = 1;
        while( i < numArr.length){
            if (numArr[i] > numArr[i-1]){
                return false;
            }
            i++;
        }
        return true ;
    }
    public static boolean isIncreasing(int[] numArr){
        int i = 1;
        while( i < numArr.length){
            if (numArr[i] < numArr[i-1]){
                return false;
            }
            i++;
        }
        return true ;
    }

}
