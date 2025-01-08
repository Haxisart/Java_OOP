package OOP_array_midterm;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        System.out.println("Choose operation (+, -, *, /):");
        char operator = scan.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }
        System.out.println("Result: " + result);
    }
}

