import java.util.Scanner;

public class MaximumCircularSubarraySum {

    // Function to find maximum subarray sum (Kadane's Algorithm)
    public static int kadaneMax(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }

    // Function to find minimum subarray sum
    public static int kadaneMin(int[] arr) {
        int minSoFar = arr[0];
        int currentMin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMin = Math.min(arr[i], currentMin + arr[i]);
            minSoFar = Math.min(minSoFar, currentMin);
        }
        return minSoFar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("24eu02037\n" );
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int totalSum = 0;

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        int maxNormal = kadaneMax(arr);

        // If all elements are negative
        if (maxNormal < 0) {
            System.out.println("Maximum Circular Subarray Sum = " + maxNormal);
            sc.close();
            return;
        }

        int minSubarray = kadaneMin(arr);
        int maxCircular = totalSum - minSubarray;

        int result = Math.max(maxNormal, maxCircular);

        System.out.println("Maximum Circular Subarray Sum = " + result);

        sc.close();
    }
}