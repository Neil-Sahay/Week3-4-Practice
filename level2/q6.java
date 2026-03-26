import java.util.Scanner;

class Friends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height (cm) of " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }
        int minAge = ages[0], minIndex = 0;
        double maxHeight = heights[0], maxIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) { minAge = ages[i]; minIndex = i; }
            if (heights[i] > maxHeight) { maxHeight = heights[i]; maxIndex = i; }
        }
        System.out.println("Youngest: " + names[minIndex] + " (age " + minAge + ")");
        System.out.println("Tallest: " + names[(int)maxIndex] + " (height " + maxHeight + " cm)");
        input.close();
    }
}
