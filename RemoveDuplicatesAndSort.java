package example.removeDuplicatesAndSort;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesAndSort {
    public static void main(String[] args) {
        // Create a new Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create an array to hold the input numbers
        int[] numbers = new int[10];

        // Read 10 numbers from the user and store them in the array
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number between 1 and 100: ");
            numbers[i] = scanner.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Remove duplicates from the array
        int uniqueCount = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] != numbers[i + 1]) {
                numbers[uniqueCount++] = numbers[i];
            }
        }
        numbers[uniqueCount++] = numbers[numbers.length - 1];

        // Sort the unique elements in descending order
        int[] sortedNumbers = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            sortedNumbers[i] = numbers[uniqueCount - i - 1];
        }

        // Print the sorted array
        System.out.println("Sorted array in descending order (with duplicates removed):");
        for (int number : sortedNumbers) {
            System.out.println(number);
        }
    }
}