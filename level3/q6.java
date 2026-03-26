import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        int count = (num == 0) ? 1 : 0;
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        System.out.println("Number of digits in " + num + " is " + count);
        input.close();
    }
}
