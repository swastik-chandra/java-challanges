package in.kgcoding.challenge82;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[]{1,6,5,9});
        ArrayOperations.Statistics statistics = opr.new Statistics();
        System.out.println(statistics.mean());
    }
}
