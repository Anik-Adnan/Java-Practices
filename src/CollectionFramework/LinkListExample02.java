package CollectionFramework;

import java.util.ArrayList;
        import java.util.List;
        import java.util.Spliterator;

public class LinkListExample02 {
    public static void main(String[] args) {
        // Creating a list
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");
        list.add("C++");
        list.add("Ruby");

        // Getting the spliterator for the list
        Spliterator<String> spliterator = list.spliterator();

        // 1. Characteristics
        int characteristics = spliterator.characteristics();
        System.out.println("Characteristics: " + characteristics);

        // 2. Estimate size
        long size = spliterator.estimateSize();
        System.out.println("Estimated size: " + size);

        // 3. Exact size
        long exactSize = spliterator.getExactSizeIfKnown();
        System.out.println("Exact size if known: " + exactSize);

        // 4. TryAdvance example
        System.out.println("Elements using tryAdvance:");
        while (spliterator.tryAdvance(System.out::println)) ;

        // Resetting spliterator
        spliterator = list.spliterator();

        // 5. forEachRemaining example
        System.out.println("Elements using forEachRemaining:");
        spliterator.forEachRemaining(System.out::println);

        // Resetting spliterator
        spliterator = list.spliterator();

        // 6. TrySplit example
        Spliterator<String> splitSpliterator = spliterator.trySplit();
        System.out.println("First half of elements using trySplit:");
        if (splitSpliterator != null) {
            splitSpliterator.forEachRemaining(System.out::println);
        }

        // Resetting spliterator
        spliterator = list.spliterator();

        // 7. TryAdvance with consumer
        System.out.println("Elements using tryAdvance with consumer:");
        spliterator.tryAdvance(element -> System.out.println("Processed element: " + element));

        // 8. forEachRemaining with consumer
        spliterator = list.spliterator();
        System.out.println("Elements using forEachRemaining with consumer:");
        spliterator.forEachRemaining(element -> System.out.println("Processed element: " + element));
    }
}
