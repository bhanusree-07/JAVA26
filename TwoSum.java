import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("24EU02037\n ");
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + " and " + i);
                System.out.println("Elements: " + complement + " and " + arr[i]);
                found = true;
                break;
            }

            map.put(arr[i], i);
        }

        if (!found) {
            System.out.println("-1");
            System.out.println("No valid pair exists.");
        }

        sc.close();
    }
}