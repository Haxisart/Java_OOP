package Matrix;

public class VarargsPassing {
    public static void sumNumbers(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        sumNumbers(1, 2, 3);  // Passing 3 arguments
        sumNumbers(4, 5, 6, 7, 8);  // Passing 5 arguments
        sumNumbers(10);  // Passing 1 argument
    }
}

