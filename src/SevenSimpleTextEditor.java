import java.util.ArrayDeque;
import java.util.Scanner;

public class SevenSimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> wordStates = new ArrayDeque<>();
        int n =Integer.parseInt(scanner.nextLine());
        StringBuilder currentText = new StringBuilder();

        for (int count = 1; count <= n ; count++) {
            String command = scanner.nextLine();// number and parameter
            String commandNumber = command.split("\\s+")[0];
            switch (commandNumber){
                case "1":
                    //text to add to current
                    String textToAdd = command.split("\\s+")[1];
                    currentText.append(textToAdd);
                    wordStates.push(currentText.toString());
                    break;
                case "2":
                    int countElements = Integer.parseInt(command.split("\\s+")[1]);
                    currentText.delete(currentText.length() - countElements, currentText.length());
                    wordStates.push(currentText.toString());
                    break;
                case "3":
                    int index = Integer.parseInt(command.split("\\s+")[1]);
                    System.out.println(currentText.charAt(index - 1));
                    break;
                case "4":
                    if (wordStates.size() > 1){
                        wordStates.pop();
                        currentText = new StringBuilder(wordStates.peek());
                    }else{
                        currentText = new StringBuilder();
                    }

                    break;


            }
        }

    }
}
