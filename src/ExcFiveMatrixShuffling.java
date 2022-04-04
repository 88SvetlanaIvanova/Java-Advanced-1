import java.util.Scanner;

public class ExcFiveMatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dimensions = scanner.nextLine();
        int rows = Integer.parseInt(dimensions.split("\\s+")[0]);
        int cols = Integer.parseInt(dimensions.split("\\s+")[1]);

        String[][] matrix = new String[rows][cols];
        fillMatrix(scanner,matrix, rows);

        String command = scanner.nextLine();
        while(!command.equals("END")){
          // valid or invalid command


            if (!validateCommand(command, rows, cols)){
                System.out.println("Invalid input!");
                command = scanner.nextLine();
                continue;
            }else{
                //valid command
                String [] commandParts = command.split("\\s+");
                int row1 = Integer.parseInt(commandParts[1]);
                int col1 = Integer.parseInt(commandParts[2]);
                int row2 = Integer.parseInt(commandParts[3]);
                int col2 = Integer.parseInt(commandParts[4]);

                String element1 = matrix[row1][col1];
                String element2 = matrix[row2][col2];

                matrix[row1][col1] = element2;
                matrix[row2][col2] = element1;

                printMatrix(matrix);



            }



            command = scanner.nextLine();
        }


    }

    private static boolean validateCommand(String command, int rows, int cols) {
        // true if valid
        String[]commandParts = command.split("\\s+");
        // starts with swap
        if (!commandParts[0].equals("swap")){
            return false;
        }
        // there are 4 parts
        if (commandParts.length != 5){
            return  false;
        }
        //coordinates are within matrix
        int row1 = Integer.parseInt(commandParts[1]);
        int col1 = Integer.parseInt(commandParts[2]);
        int row2 = Integer.parseInt(commandParts[3]);
        int col2 = Integer.parseInt(commandParts[4]);

        if (row1 < 0 || row1 >= rows || row2 < 0 || row2 >= rows || col1 < 0 ||col1 >= cols
        ||col2 < 0 || col2 > cols){
           return false;
        }



        return true;
    }

    private static void fillMatrix(Scanner scanner, String[][] matrix,int rows) {
        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");

        }
    }
    public static void printMatrix(String[][]matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
