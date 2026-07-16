import java.util.Scanner;

public class FirstMissingPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("24eu02037\n");
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Place each positive number at its correct position
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n &&
                   arr[arr[i] - 1] != arr[i]) {

                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }

        // Find the first missing positive
        int missing = n + 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                missing = i + 1;
                break;
            }
        }

        System.out.println("First Missing Positive Integer: " + missing);

        sc.close();
    }
}