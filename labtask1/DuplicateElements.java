import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("24eu02037\n ");
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements are:");

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if element has already been printed
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                continue;
            }

            // Check for duplicates ahead
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }

        sc.close();
    }
}