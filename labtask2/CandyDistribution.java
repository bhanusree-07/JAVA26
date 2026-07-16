import java.util.Scanner;

public class CandyDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("24eu02037\n");
        System.out.print("Enter the number of children: ");
        int n = sc.nextInt();

        int[] ratings = new int[n];
        int[] candies = new int[n];

        System.out.println("Enter the ratings:");
        for (int i = 0; i < n; i++) {
            ratings[i] = sc.nextInt();
            candies[i] = 1; // Every child gets at least one candy
        }

        // Left to right pass
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Right to left pass
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        int totalCandies = 0;
        System.out.println("\nCandy Distribution:");
        System.out.println("Child\tRating\tCandies");

        for (int i = 0; i < n; i++) {
            totalCandies += candies[i];
            System.out.println((i + 1) + "\t" + ratings[i] + "\t" + candies[i]);
        }

        System.out.println("\nMinimum Candies Required = " + totalCandies);

        sc.close();
    }
}