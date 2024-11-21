import java.util.ArrayList;

public class CheckArrayListSize {
    public static void main(String[] args) {
        ArrayList<String> input=new ArrayList<>();
        System.out.println(input.isEmpty());
        input.add("Java");
        input.add("Python");
        input.add("C++");
        System.out.println("ArrayList consist of "+input);
        System.out.println("Size of ArrayList "+input.size());
    }
}
