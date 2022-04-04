import java.util.Arrays;
import java.util.Scanner;

public class Four4Sum4Matrix4Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sizeInput = scanner.nextLine();
        int rows = Integer.parseInt(sizeInput.split(", ")[0]);
        int [][] matrix = readIntMatrix(rows,scanner, ", ");
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                sum += matrix[row][col];
            }
        }
        System.out.println(sum);

    }
    public static int[][] readIntMatrix(int rows,Scanner scanner, String splitPattern){
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine()
                    .split(splitPattern))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }return matrix;

    }
}
