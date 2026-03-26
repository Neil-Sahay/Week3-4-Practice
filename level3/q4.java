import java.util.Scanner;

class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (>1): ");
        int num = input.nextInt();
        if (num <= 1) {
            System.out.println("Number must be > 1.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(num + " is a prime number.");
            else System.out.println(num + " is not a prime number.");
        }
        input.close();
    }
}
