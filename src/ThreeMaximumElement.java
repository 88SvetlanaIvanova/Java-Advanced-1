import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class ThreeMaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int count = 1; count <=n ; count++) {
            String command = scanner.nextLine();
            //•	"1 X" - Push the element X into the stack.
            //•	"2" - Delete the element present at the top of the stack.
            //•	"3" - Print the maximum element in the stack.
            if (command.equals("2")){
                stack.pop();

            }else if (command.equals("3")){
                // if there are elements
                if (stack.size() > 0){
                    System.out.println(Collections.max(stack));
                }
            }else{
                int x = Integer.parseInt(command.split("\\s+")[1]);
                stack.push(x);
            }
        }


    }
}
