import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        // Creating a HashSet
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        set.add("Kiwi");
        System.out.println("Initial HashSet: " + set);

        // Attempting to add duplicate elements
        set.add("Apple");
        set.add("Banana");
        System.out.println("After adding duplicates: " + set); // Duplicates won't be added

        // Checking if an element exists
        boolean hasCherry = set.contains("Cherry");
        System.out.println("Contains Cherry? " + hasCherry);

        // Removing an element
        set.remove("Date");
        System.out.println("After removing Date: " + set);

        // Checking the size of the HashSet
        System.out.println("Size of HashSet: " + set.size());

        // Check if HashSet is empty
        System.out.println("Is HashSet empty? " + set.isEmpty());
    }
}
