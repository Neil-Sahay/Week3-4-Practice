import java.util.Scanner;

class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer (<100): ");
        int num = input.nextInt();
        if (num <= 0 || num >= 100) {
            System.out.println("Invalid input.");
        } else {
            System.out.print("Multiples of " + num + " below 100: ");
            for (int i = 100; i >= 1; i--) {
                if (i % num == 0) System.out.print(i + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
