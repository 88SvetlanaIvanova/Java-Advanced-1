import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Eight8Wrong8Measurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = readIntMatrix(rows, scanner,"\\s+");

        int[] coordinates =  readArray(scanner.nextLine());

        int wrongValue = matrix[coordinates[0]][coordinates[1]];
        List<int[]> updatedValues = new ArrayList<>();

        for (int row = 0; row <matrix.length ; row++) {
            for (int col = 0; col <matrix[row].length; col++) {
                if (matrix[row][col] == wrongValue){
                    updatedValues.add(new int[]{row, col,getClosestItemsSum(row,col, matrix,wrongValue) });

                }
            }
        }

        for (int[]updatedValue :updatedValues) {
            matrix[updatedValue[0]][updatedValue[1]] = updatedValue [2];

        }





        printMatrix(matrix);


    }
    public static boolean isInBounds(int row, int col, int[][] matrix){
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;

    }
    public static boolean isOutOfBounds(int row, int col, int[][]matrix){
        return !isInBounds(row,col,matrix);
    }

    private static int getClosestItemsSum(int row, int col, int[][] matrix, int wrongValue) {
       int sum = 0;
       if (isInBounds(row, col+1, matrix)&& matrix[row][col +1] != wrongValue){
          sum += matrix[row][col +1];//right

       }
       if (isInBounds(row, col-1, matrix) && matrix[row][col - 1] != wrongValue){
         sum+=  matrix[row][col -1];//left
       }
       if (isInBounds(row +1, col, matrix) && matrix[row + 1][col] != wrongValue){
           sum+=matrix[row + 1][col];//down
       }
       if (isInBounds(row -1, col, matrix)&& matrix[row - 1][col] != wrongValue){
           sum+=matrix[row - 1][col];//up
       }
        return  sum;


    }

    private static int[] readArray(String nextLine) {
        int[] firstArray = Arrays
                .stream(nextLine.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        return firstArray;
    }

    public static int[][] readIntMatrix(int rows, Scanner scanner, String splitPattern){
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine()
                    .split(splitPattern))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }return matrix;
    }
    public static void printMatrix(int[][]matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
