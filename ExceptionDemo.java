import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        try {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            int result = a / b;
            System.out.println("a / b = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Demonstrating ArrayIndexOutOfBoundsException
        int[] array = { 1, 2, 3 };
        try {
            System.out.println("Value at index 3: " + array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        scanner.close();
    }
}
