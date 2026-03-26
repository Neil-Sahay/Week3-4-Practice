import java.util.Scanner;

class FactorsWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.print("Factors: ");
            int i = 1;
            while (i <= num) {
                if (num % i == 0) System.out.print(i + " ");
                i++;
            }
            System.out.println();
        }
        input.close();
    }
}
