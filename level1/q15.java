import java.util.Scanner;

class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int fact = 1;
            for (int i = 1; i <= num; i++) fact *= i;
            System.out.println("Factorial of " + num + " is " + fact);
        }
        input.close();
    }
}
