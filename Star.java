package task5java;

import java.util.Scanner;

public class Star{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Generate the pattern
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // Odd rows
                System.out.print("*");
                if (i > 1) { // For rows after the first, add a space and another star
                    System.out.print(" *");
                }
            } else { // Even rows
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}
