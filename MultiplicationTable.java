package OOP_array_midterm;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 5;
        printMultiplicationTable(number);
    }

    public static void printMultiplicationTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
