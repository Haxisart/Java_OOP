package Matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting {
    public static void sortList(List<Integer> list) {
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);

        System.out.println("Original List: " + numbers);
        sortList(numbers);
    }
}

