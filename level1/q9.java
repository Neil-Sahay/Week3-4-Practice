import java.util.Scanner;

class CountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter countdown start: ");
        int start = input.nextInt();
        for (int i = start; i >= 1; i--) {
            System.out.println(i);
        }
        input.close();
    }
}
