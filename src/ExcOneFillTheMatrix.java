import java.util.Scanner;

public class ExcOneFillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(input.split(", ")[0]);
        String pattern = input.split(", ")[1];
        int [][] matrix = new int [n][n];
        if (pattern.equals("A")){
           fillMatrixPatternA(matrix);

        }
        else if(pattern.equals("B")){
            fillMatrixPatternB(matrix);
        }
        printMatrix(matrix);
    }

    private static void fillMatrixPatternB(int[][] matrix) {
        // even column -> 0 till last
        // odd column -> last till 0
        int startNumber = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col %2 == 0){
                for (int row = 0; row <matrix.length ; row++) {
                    matrix[row][col] = startNumber++;
                }
            }else{
                for (int row = matrix.length -1; row >=0 ; row--) {
                    matrix[row][col] = startNumber++;
                }
            }
        }
        
    }

    private static void fillMatrixPatternA(int[][]matrix) {
        int startNumber = 1;
        for (int col = 0; col <matrix.length ; col++) {
            for (int row = 0; row <matrix.length ; row++) {
                matrix[row][col] = startNumber++;
            }
        }
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
