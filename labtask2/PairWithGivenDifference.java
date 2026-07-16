import java.util.Scanner;

public class PairWithGivenDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("24EU02037\n");
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the given difference: ");
        int diff = sc.nextInt();

        boolean found = false;

        System.out.println("Pairs with absolute difference " + diff + ":");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(arr[i] - arr[j]) == diff) {
                    System.out.println(arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pairs found.");
        }

        sc.close();
    }
}