import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Frequency {
    public static void main(String[] args) {
    List<Integer> list  = Arrays.asList(1,2,3,1,4,5,3,3,4,3,32,25,6);
        System.out.println(Collections.frequency(list ,1));
        System.out.println(Collections.frequency(list ,2));
        System.out.println(Collections.frequency(list ,4));


    }
}
