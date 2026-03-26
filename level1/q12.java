import java.util.Scanner;

class SumNaturalCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number.");
        } else {
            int sumFormula = n * (n + 1) / 2;
            int sumWhile = 0, i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }
            System.out.println("Formula sum = " + sumFormula);
            System.out.println("While loop sum = " + sumWhile);
            if (sumFormula == sumWhile)
                System.out.println("Both results match.");
            else
                System.out.println("Mismatch!");
        }
        input.close();
    }
}
