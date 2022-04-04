import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TwoPositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split("\\s+");
          int rows = Integer.parseInt(dimensions[0]);
          int cols = Integer.parseInt(dimensions[1]);

          int [][] matrix = new int [rows][cols];

        for (int row = 0; row < rows ; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();
        }
        int number = Integer.parseInt(scanner.nextLine());



        ArrayList<int[]> indexes = new ArrayList<>();
        //obhozhdane na matrix
        for (int row = 0; row <matrix.length ; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
              int current = matrix[row][col];
              if (current == number){
                  int[]foundAt = {row,col};
                  indexes.add(foundAt);
              }
            }
        }
        if (indexes.isEmpty()){
            System.out.println("not found");
        }else{
//            for (int[]index: indexes) {
//                System.out.println(index[0] + " " + index[1]);
//            }
            String output =indexes.stream()
                    .map(arr -> arr[0] + " "+ arr[1])
                    .collect(Collectors.joining(System.lineSeparator()));
            System.out.println(output);
        }

    }
}
