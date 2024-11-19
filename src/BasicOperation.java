import java.util.ArrayList;

public class BasicOperation {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        input.add("John");
        input.add("Emma");
        input.add("Ava");
        input.add("Liam");
        input.add("Olivia");

        for(String display:input){
            System.out.println(display);
        }
        input.remove(2);
        input.remove(3);
        System.out.println("After element removal");
        for(String display:input){
            System.out.println(display);
        }



    }
}
