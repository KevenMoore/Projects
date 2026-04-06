import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Cherry");
        words.add("Date");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Words List:");
        for (String w : words) {
            System.out.println(w);
        }

        System.out.println("\nNumbers List:");
        for (Integer n : numbers) {
            System.out.println(n);
        }

        words.remove(1);
        numbers.add(1, 99);

        System.out.println("\nWords List After Changes:");
        words.forEach(item -> System.out.println(item));

        System.out.println("\nNumbers List After Changes:");
        numbers.forEach(item -> System.out.println(item));
    }
}

