import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int original = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        if (original == sum)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is not an Armstrong number.");
        input.close();
    }
}
