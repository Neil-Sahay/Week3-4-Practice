import java.util.Scanner;

class SumNaturalFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number.");
        } else {
            int sumFor = 0;
            for (int i = 1; i <= n; i++) sumFor += i;
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Formula sum = " + sumFormula);
            System.out.println("For loop sum = " + sumFor);
        }
        input.close();
    }
}
