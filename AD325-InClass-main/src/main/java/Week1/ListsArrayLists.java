package Week1;

import java.util.ArrayList;
import java.util.List;

public class ListsArrayLists {
    public static void main(String[] args) {
        // Generalized form of list
        List<Object> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add(1);
        colors.add(new Object());

        // Typed form of list
        ArrayList<String> shapes = new ArrayList<>();
        shapes.add("circle");

        System.out.println(colors);
        System.out.println(shapes);
        System.out.println(shapes.size());
        System.out.println(shapes.contains("square"));

        // Loop through and print colors
        for (Object color : colors) {
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for (Object color : colors) {
            System.out.println(color);
        }

        // Example usage of the repeat method
        repeat(shapes, 3);
        System.out.println("Repeated shapes: " + shapes);
    }

    public static void repeat(ArrayList<String> list, int k) {
        if (k <= 0) {
            list.clear(); // Clear the list if k is 0 or negative
            return;
        }

        ArrayList<String> result = new ArrayList<>();

        for (String element : list) {
            for (int i = 0; i < k; i++) {
                result.add(element); // Add k copies of the element
            }
        }

        list.clear(); // Clear the original list and add the new elements
        list.addAll(result);
    }
}
