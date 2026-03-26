import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.print("Factors: ");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) System.out.print(i + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
