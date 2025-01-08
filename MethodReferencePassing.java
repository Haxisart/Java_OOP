package Matrix;

public class MethodReferencePassing {
    public static void applyToInteger(int x, java.util.function.IntConsumer func) {
        func.accept(x);
    }

    public static void main(String[] args) {
        int num = 10;
        applyToInteger(num, n -> System.out.println("Value is: " + n));
        applyToInteger(num, n -> System.out.println("Value squared is: " + (n * n)));
    }
}

