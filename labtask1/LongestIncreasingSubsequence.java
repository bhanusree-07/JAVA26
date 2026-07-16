import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("24eu02037\n");
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[n];
        int[] prev = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            prev[i] = -1;
        }

        int maxLength = 1;
        int lastIndex = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }

            if (dp[i] > maxLength) {
                maxLength = dp[i];
                lastIndex = i;
            }
        }

        int[] lis = new int[maxLength];
        int index = maxLength - 1;

        while (lastIndex != -1) {
            lis[index--] = arr[lastIndex];
            lastIndex = prev[lastIndex];
        }

        System.out.println("Longest Increasing Subsequence:");

        for (int i = 0; i < maxLength; i++) {
            System.out.print(lis[i] + " ");
        }

        System.out.println("\nLength = " + maxLength);

        sc.close();
    }
}