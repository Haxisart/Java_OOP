package Matrix;

import java.util.ArrayList;
import java.util.List;

public class ListPassing {
    public static void addElementToList(List<String> list) {
        list.add("New Element");
        System.out.println("List after adding new element: " + list);
    }

    public static void displayList(List<String> list) {
        System.out.println("List elements: " + list);
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("First Element");

        System.out.println("Original List:");
        displayList(stringList);

        addElementToList(stringList);
        System.out.println("Updated List:");
        displayList(stringList);
    }
}

