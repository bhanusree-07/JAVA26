import java.util.Scanner;

public class RainwaterTrapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("24EU02037\n");
        System.out.print("Enter the number of buildings: ");
        int n = sc.nextInt();

        int[] height = new int[n];
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        System.out.println("Enter the heights:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        // Left maximum heights
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Right maximum heights
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // Calculate trapped water
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            totalWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        System.out.println("Total Rainwater Trapped = " + totalWater + " units");

        sc.close();
    }
}