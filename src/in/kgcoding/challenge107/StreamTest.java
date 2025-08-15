package in.kgcoding.challenge107;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> Name = List.of("Swastik", "Chandra ","Agrahari");
        Name.stream().
                forEach(name -> System.out.println(Name));
    }
}
