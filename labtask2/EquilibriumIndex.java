import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("24eu02037 \n ");
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int totalSum = 0;

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum -= arr[i]; // Right sum

            if (leftSum == totalSum) {
                System.out.println("Equilibrium Index: " + i);
                sc.close();
                return;
            }

            leftSum += arr[i];
        }

        System.out.println("No Equilibrium Index found.");

        sc.close();
    }
}