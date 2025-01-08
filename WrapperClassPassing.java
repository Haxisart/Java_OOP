package Matrix;

public class WrapperClassPassing {
    public static void updateInteger(Integer integerValue) {
        integerValue = integerValue + 5; // Integer is immutable
        System.out.println("Updated Integer Value: " + integerValue);
    }

    public static void displayDouble(Double doubleValue) {
        System.out.println("Double Value: " + doubleValue);
    }

    public static void main(String[] args) {
        Integer intValue = 10;
        displayDouble(20.5);
        updateInteger(intValue);
        System.out.println("Original Integer Value after method call: " + intValue);
    }
}

