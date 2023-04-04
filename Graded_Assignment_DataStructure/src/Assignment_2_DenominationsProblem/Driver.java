package Assignment_2_DenominationsProblem;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		// First Sorting With BubbleSort. Which code is also working
		// and given below ,which is commented out.

		// IntegerSorting sorting = new BubbleSort();

		// Merge sort Implementation.
		IntegerSorting sorting = new MergeSort();
		NotesCount counting = new NotesCount();

		System.out.println("Enter The size of Currency Denominations :");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] denominations = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Entering the Denominations " + (i + 1) + " Currency");
			denominations[i] = sc.nextInt();
		}
		System.out.println("Enter the Total Currency you want to pay");
		int amount = sc.nextInt();
		// Sorting in descending Order
		sorting.sort(denominations);

		// Printing the notes count
		counting.calculateNotesCount(denominations, amount);

	}

}
