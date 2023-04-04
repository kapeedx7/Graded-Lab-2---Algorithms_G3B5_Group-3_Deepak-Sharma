package Assignment_1_TransactionsPayMoneyProblem;

import java.util.Scanner;

public class Transactions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Transaction array");
		int transSize = sc.nextInt();
		System.out.println("Enter the values of array");
		int[] transactions = new int[transSize];
		for (int i = 0; i < transSize; i++) {
			transactions[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetSize = sc.nextInt();
		for (int i = 0; i < targetSize; i++) {
			System.out.println("Enter the target value");
			int target = sc.nextInt();
			int result = getNoOfTransactionsForTarget(transactions, target);
			if (result > 0) {
				System.out.println("Target achieved after " + result + " transactions");

			} else {
				System.out.println("Given target is not achieved");
			}
		}
		sc.close();

	}

	// This method will be called for each Target.
	private static int getNoOfTransactionsForTarget(int[] transactions, int target) {
		int sum = 0;
		for (int i = 0; i < transactions.length; i++) {
			sum += transactions[i];
			if (sum >= target) {
				return i + 1;// Success.
			}
		}
		return -1;

	}

}
