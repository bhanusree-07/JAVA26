import java.util.Scanner;

public class RearrangeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("24eu02037\n");
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] result = new int[n];
        int index = 0;

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Store negative numbers first
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                result[index++] = arr[i];
            }
        }

        // Store positive numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                result[index++] = arr[i];
            }
        }

        System.out.println("Rearranged Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}