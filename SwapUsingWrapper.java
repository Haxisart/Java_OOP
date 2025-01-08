package Matrix;

public class SwapUsingWrapper {
    static class Wrapper {
        int value;

        Wrapper(int value) {
            this.value = value;
        }
    }

    public static void swap(Wrapper a, Wrapper b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static void main(String[] args) {
        Wrapper num1 = new Wrapper(5);
        Wrapper num2 = new Wrapper(10);

        System.out.println("Before Swap: num1 = " + num1.value + ", num2 = " + num2.value);
        swap(num1, num2);
        System.out.println("After Swap: num1 = " + num1.value + ", num2 = " + num2.value);
    }
}

