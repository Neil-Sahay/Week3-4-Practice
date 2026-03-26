import java.util.Scanner;

class SmallestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        boolean isFirstSmallest = (a < b && a < c);
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
        input.close();
    }
}
