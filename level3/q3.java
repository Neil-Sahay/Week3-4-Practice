import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks in Physics, Chemistry, Maths: ");
        double phy = input.nextDouble();
        double chem = input.nextDouble();
        double maths = input.nextDouble();
        double avg = (phy + chem + maths) / 3;
        String grade;
        if (avg >= 80) grade = "A (Level 4)";
        else if (avg >= 70) grade = "B (Level 3)";
        else if (avg >= 60) grade = "C (Level 2)";
        else if (avg >= 50) grade = "D (Level 1)";
        else if (avg >= 40) grade = "E (Level 1-)";
        else grade = "R (Remedial)";
        System.out.printf("Average = %.2f%n", avg);
        System.out.println("Grade = " + grade);
        input.close();
    }
}
