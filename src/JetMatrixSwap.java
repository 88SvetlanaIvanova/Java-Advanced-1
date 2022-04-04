import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class JetMatrixSwap {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = numbers[0];
        int cols = numbers[1];
        int[][] matrix = new int[rows][cols];


        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }


        int[] indexes = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        indexes[0] = indexes[0];
        indexes[1] = indexes[1];


        for (int i = 0; i < rows; i++) {
            int temp = matrix[i][indexes[0]];
            matrix[i][indexes[0]] = matrix[i][indexes[1]];
            matrix[i][indexes[1]] = temp;
        }


        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }


    }


}
