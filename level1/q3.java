import java.util.Scanner;

class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        boolean firstLargest = (a >= b && a >= c);
        boolean secondLargest = (b >= a && b >= c);
        boolean thirdLargest = (c >= a && c >= b);
        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);
        input.close();
    }
}
