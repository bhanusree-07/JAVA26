import java.util.Scanner;

public class MostRepetitiveNumber {
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

        int maxCount = 0;
        int mostRepeated = arr[0];

        for (int i = 0; i < n; i++) {
            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostRepeated = arr[i];
            }
        }

        System.out.println("Most Repetitive Number: " + mostRepeated);
        System.out.println("Frequency: " + maxCount);

        sc.close();
    }
}