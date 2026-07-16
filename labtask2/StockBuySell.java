import java.util.Scanner;

public class StockBuySell {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("24eu02037\n");
        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter the stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        System.out.println("Maximum Profit = " + maxProfit);

        sc.close();
    }
}