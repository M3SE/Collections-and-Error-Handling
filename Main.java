import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        try {
            integers.add(10);
            integers.add(20);
            integers.add(30);
            integers.add(20); // duplicate
            integers.add(10); // duplicate
            integers.add(40);
            integers.add(50);

            // Removing duplicates using Set
            Set<Integer> uniqueIntegers = new HashSet<>(integers);

            // Calculating the sum and average of the integers
            int sum = 0;
            for (int num : uniqueIntegers) {
                sum += num;
            }
            double average = (uniqueIntegers.size() > 0) ? (double) sum / uniqueIntegers.size() : 0;

            // Printing the results
            System.out.println("List of integers without duplicates: " + uniqueIntegers);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

        } catch (IndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Operation completed.");
        }
    }
}
