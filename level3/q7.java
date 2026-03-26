import java.util.Scanner;

class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double weight = input.nextDouble();
        System.out.print("Enter height (cm): ");
        double heightCm = input.nextDouble();
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal weight";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";
        System.out.printf("BMI = %.2f (%s)%n", bmi, status);
        input.close();
    }
}
