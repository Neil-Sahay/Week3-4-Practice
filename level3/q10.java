import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first = input.nextDouble();
        System.out.print("Enter second number: ");
        double second = input.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String op = input.next();
        double result;
        switch (op) {
            case "+": result = first + second; break;
            case "-": result = first - second; break;
            case "*": result = first * second; break;
            case "/": result = first / second; break;
            default: System.out.println("Invalid operator"); return;
        }
        System.out.println(first + " " + op + " " + second + " = " + result);
        input.close();
    }
}
