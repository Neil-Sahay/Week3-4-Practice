import java.util.Scanner;

class Harshad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int original = num;
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        if (original % sum == 0)
            System.out.println(original + " is a Harshad number.");
        else
            System.out.println(original + " is not a Harshad number.");
        input.close();
    }
}
