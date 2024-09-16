import java.util.Scanner;

public class FibonacciChecker {
    public static boolean isFibonacci(int number) {
        if (number == 0 || number == 1) {
            return true;
        }

        int prev = 0, current = 1, next = prev + current;

        while (next <= number) {
            if (next == number) {
                return true;
            }
            prev = current;
            current = next;
            next = prev + current;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}