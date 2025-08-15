import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListSwapping {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,1,4,3,3,3,2,4,5,3);
        System.out.println(list);
      swap(list , 3 ,10);
        System.out.println(list);
    }

    public static void swap ( List<Integer>  list ,int x , int y){
    int swap = list.get(x);
    list.set(x, list.get(y));
        list.set(y, swap);

    }
}
