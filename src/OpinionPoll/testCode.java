package OpinionPoll;

import java.util.Scanner;

public class testCode {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String coordinates = scanner.nextLine();
        coordinates = coordinates.replaceAll("\\s+", "");
        if ((coordinates.matches("/^[a-zA-Z\s]*$/g"))) {
            System.out.println("You should enter numbers!");
        } else {
            System.out.println("Numbers");
        }

    }
}