import java.util.Scanner;

class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base and exponent (positive integers): ");
        int base = input.nextInt();
        int exp = input.nextInt();
        if (exp < 0) {
            System.out.println("Exponent must be non-negative.");
        } else {
            long result = 1;
            for (int i = 1; i <= exp; i++) {
                result *= base;
            }
            System.out.println(base + "^" + exp + " = " + result);
        }
        input.close();
    }
}
