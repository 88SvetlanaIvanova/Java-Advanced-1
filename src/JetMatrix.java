import java.util.Scanner;

class JetMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num % 2 != 0 && num <= 15) {
            String[][] matrix = new String[num][num];
            for (int col = 0; col < matrix.length; col++) {
                for (int row = 0; row < matrix.length; row++) {

                    if (row == col || row == matrix.length / 2 || col == matrix.length / 2) {

                        matrix[row][col] = "*";
                    } else {
                        matrix[row][col] = ".";
                    }
                }
            }
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix.length; col++) {
                    if (col == matrix.length - row - 1) {
                        matrix[row][col] = "*";
                    }
                }
            }
            for (String[] strings : matrix) {
                for (String string : strings) {
                    System.out.print(string + " ");
                }
                System.out.println();
            }
        }
    }
}