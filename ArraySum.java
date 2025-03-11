public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};   // Declare and initialize the array
        int sum = 0;                            // Variable to store the sum of array elements

        for (int num : numbers) {               // Enhanced for loop to iterate through the array elements
            sum += num;                         // Add each element to sum
        }

        System.out.println("The sum of array element is: " + sum);  // Output the sum of elements
    }
}
