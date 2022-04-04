import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.");
        int answer = Integer.parseInt(scanner.next());
        while (answer != 2) {
            System.out.println("Please, try again.");
            answer = Integer.parseInt(scanner.next());
        }
        System.out.println("Congratulations, have a nice day!");


    }


    public static int[][] readMatrix(int rows, Scanner scanner) {
        int[][] matrix = new int[rows][];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;


    }


}

