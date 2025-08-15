package in.kgcoding.challenge109;

import java.util.List;

public class OddNumbers {
    public static void main(String[] args) {
        List<Integer> Numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        Numbers.stream().filter(Num -> Num % 2==1)
                .forEach(Num -> System.out.println(Num));

    }
}
