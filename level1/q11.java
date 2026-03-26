import java.util.Scanner;

class SumUntilNonPositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double value;
        System.out.println("Enter numbers (0 or negative to stop):");
        while (true) {
            value = input.nextDouble();
            if (value <= 0) break;
            total += value;
        }
        System.out.println("Sum = " + total);
        input.close();
    }
}
