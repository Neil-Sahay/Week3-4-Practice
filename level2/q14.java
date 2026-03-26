import java.util.Scanner;

class PowerWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base and exponent (positive integers): ");
        int base = input.nextInt();
        int exp = input.nextInt();
        if (exp < 0) {
            System.out.println("Exponent must be non-negative.");
        } else {
            long result = 1;
            int i = 1;
            while (i <= exp) {
                result *= base;
                i++;
            }
            System.out.println(base + "^" + exp + " = " + result);
        }
        input.close();
    }
}
