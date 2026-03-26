import java.util.Scanner;

class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        int greatest = 1;
        for (int i = num - 1; i >= 1; i--) {
            if (num % i == 0) {
                greatest = i;
                break;
            }
        }
        System.out.println("Greatest factor of " + num + " (other than itself) is " + greatest);
        input.close();
    }
}
