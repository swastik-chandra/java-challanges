 class PalindromeArray {
     public static void main(String[] args) {
         System.out.println("Welcome to Palindrome checker ");
         int[] numArr = ArrayUtility.inputArray();
         boolean isPalin = isPalindrome(numArr);
         if (isPalin) {
             System.out.println(" your  Array is Palindrome ");
         } else {
             System.out.println(" your Array is not Palindrome");
         }
     }

     public static boolean isPalindrome(int[] numArr) {
         int i = 0;
         while (i < numArr.length / 2) {
             if (numArr[i] != numArr[numArr.length - 1 - i]) {
                 return false;
             }
             i++;
         }
         return true;

     }

 }