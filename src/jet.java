import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class jet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] inputNumbers = scanner.nextLine().split("\\s+"); //["1", "2", "3", "4", "5"]

        String[] inputNumbersTwo = scanner.nextLine().split("\\s+");
        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String number : inputNumbers) {
            queue.offer(number);
        }
        for (String number : inputNumbersTwo) {
            queue.offer(number);
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
