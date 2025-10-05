import java.util.*;

public class builtin_algorithms {
    public static void main(String[] args) {
        // Example usage of built-in algorithms

        // 1. Sorting a list
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3); // hard coded list
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        // 2. Shuffling a list meaning randomizing the order of elements
        Collections.shuffle(numbers);
        System.out.println("Shuffled list: " + numbers);

        // 3. Binary search
        int index = Collections.binarySearch(numbers, 3);
        System.out.println("Index of 3: " + index);

        // 4. Finding max and min
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("Max: " + max + ", Min: " + min);
        int a = 10, b = 20;
        int maximum = Math.max(a, b);
        int minimum = Math.min(a, b);
        System.out.println("Max: " + maximum + ", Min: " + minimum);


        // 5. Reversing a list
        Collections.reverse(numbers);
        System.out.println("Reversed list: " + numbers);

        // 6. Filling a list with a specific value
        Collections.fill(numbers, 0);
        System.out.println("Filled list: " + numbers);

        // type conversion
        // integer to string
        int num = 123;
        String str = Integer.toString(num);
        System.out.println("String: " + str);
        // string to integer
        String str2 = "456";
        int num2 = Integer.parseInt(str2);
        System.out.println("Integer: " + num2);
        // integer to double
        double d = (double) num;
        System.out.println("Double: " + d);
        // double to integer
        int num3 = (int) d;
        System.out.println("Integer: " + num3);
        // string to double
        String str3 = "789.01";
        double d2 = Double.parseDouble(str3);
        System.out.println("Double: " + d2);
        // double to string
        String str4 = Double.toString(d2);
        System.out.println("String: " + str4);

        // 7. Swapping elements in a list
        Collections.swap(numbers, 0, 1);
        System.out.println("Swapped list: " + numbers);

        // 8. Counting frequency of an element in a list
        int frequency = Collections.frequency(numbers, 0);
        System.out.println("Frequency of 0: " + frequency);

        

    }
}
