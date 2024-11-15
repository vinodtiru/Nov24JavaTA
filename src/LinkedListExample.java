import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Using push to add elements at the beginning (like stack push)
        list.push("Apple");
        list.push("Banana");
        list.push("Cherry");
        System.out.println("After push operations: " + list); // [Cherry, Banana, Apple]

        // Using poll to remove the first element
        String firstElement = list.poll();
        System.out.println("Polled element: " + firstElement); // Cherry
        System.out.println("After poll operation: " + list); // [Banana, Apple]

        // Inserting an element in between
        list.add(1, "Orange"); // Insert "Orange" at index 1
        System.out.println("After inserting Orange at index 1: " + list); // [Banana, Orange, Apple]

        // Adding elements at the end of the list
        list.add("Mango");
        list.push("Grapes");
        System.out.println("After adding elements at the end: " + list); // [Banana, Orange, Apple, Mango, Grapes]

        // Inserting at the beginning and end using specific methods
        list.addFirst("Pineapple"); // Adds "Pineapple" at the beginning
        list.addLast("Watermelon"); // Adds "Watermelon" at the end
        System.out.println("After addFirst and addLast operations: " + list);

    }




}
