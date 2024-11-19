import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArrays {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        input.add("John");
        input.add("Emma");
        input.add("Ava");
        input.add("Liam");
        input.add("Olivia");
        input.add("Emma");
        Set<String> covertInput=new HashSet<>(input);

        ArrayList<String> finalResult=new ArrayList<>(covertInput);
        System.out.println(finalResult);

    }
}
