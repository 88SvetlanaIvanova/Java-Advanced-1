package BookWorm;

import java.util.Scanner;

public class BookWorm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder initial = new StringBuilder(scanner.nextLine()) ;

        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];

        int[] position = new int[2];//my  coordinates

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            matrix[i] = line.toCharArray();
            if (line.contains("P")) {
                position[0] = i;
                position[1] = line.indexOf("P");
            }
        }

        String command = scanner.nextLine();

        while (!command.equalsIgnoreCase("end")){
            if (command.equals("up")){
              movePlayer(matrix,position , position[0] - 1, position[1], initial);
            }else if (command.equals("down")){
                movePlayer(matrix,position , position[0] + 1, position[1], initial);
            }else if (command.equals("left")){
                movePlayer(matrix,position , position[0] , position[1]-1, initial);
            }else  {
                movePlayer(matrix,position , position[0] , position[1]+1, initial);
            }
            command = scanner.nextLine();

        }
        System.out.println(initial.toString());
        printMatrix(matrix);

    }



    private static void printMatrix(char[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }


    private static  void movePlayer(char[][] matrix,int[] position, int newRow, int newCol, StringBuilder text ){
        if (isOutOfBounds(matrix, newRow, newCol)) {
            if (text.length() != 0) {
                text.deleteCharAt(text.length() - 1);
            }
            return;
        }

        if (matrix[newRow][newCol] != '-') {
            text.append(matrix[newRow][newCol]);
        }

        matrix[position[0]][position[1]] = '-';
        matrix[newRow][newCol] = 'P';

        position[0] = newRow;
        position[1] = newCol;


    }


    private static boolean isOutOfBounds(char[][] field, int row, int col) {
        return row < 0 || row >= field.length || col < 0 || col >= field[row].length;
    }


}
