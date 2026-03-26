import java.util.Scanner;

class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        int greatest = 1;
        int i = num - 1;
        while (i >= 1) {
            if (num % i == 0) {
                greatest = i;
                break;
            }
            i--;
        }
        System.out.println("Greatest factor of " + num + " (other than itself) is " + greatest);
        input.close();
    }
}
