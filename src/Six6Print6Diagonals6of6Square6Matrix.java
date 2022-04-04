import java.util.Arrays;
import java.util.Scanner;

public class Six6Print6Diagonals6of6Square6Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][]matrix = readIntMatrix(size, scanner, "\\s+");

        int row = 0,  col = 0;

        while (row < size && col < size){
            int current = matrix[row][col];
            System.out.print(current + " ");
            row++;
            col++;
        }
        System.out.println();

        row = size - 1;
        col = 0;

        while(row >=0 && col < size){
            int current = matrix[row][col];
            System.out.print(current + " ");
            row--;
            col++;
        }


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
