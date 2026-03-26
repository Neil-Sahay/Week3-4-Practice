import java.util.Scanner;

class SumNatural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        }
        input.close();
    }
}
