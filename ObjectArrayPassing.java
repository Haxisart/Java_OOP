package Matrix;

public class ObjectArrayPassing {
    static class Item {
        String name;

        Item(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void updateItems(Item[] items) {
        for (int i = 0; i < items.length; i++) {
            items[i] = new Item("Item " + (i + 1));
        }
    }

    public static void displayItems(Item[] items) {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Item[] items = new Item[3];

        System.out.println("Original Items:");
        displayItems(items);

        updateItems(items);
        System.out.println("Updated Items:");
        displayItems(items);
    }
}

