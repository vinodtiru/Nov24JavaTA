import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(8);
        num.add(9);
        num.add(4);
        num.add(1);
        num.add(7);
        Collections.sort(num);
        System.out.println(num);
    }
}
