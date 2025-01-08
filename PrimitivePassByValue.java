package Matrix;

public class PrimitivePassByValue {
    public static void modifyValue(int value) {
        value += 10;
        System.out.println("Inside modifyValue method: " + value);
    }

    public static void main(String[] args) {
        int num = 20;
        System.out.println("Original Value: " + num);
        modifyValue(num);
        System.out.println("Value after method call: " + num);  // Value remains unchanged
    }
}
