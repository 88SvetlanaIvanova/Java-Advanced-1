import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleCalcultor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        stack.addAll(Arrays.asList(scanner.nextLine().split("\\s+")));
        while(stack.size() > 1){//!stack.isEmpty()
            int right = Integer.parseInt(stack.pop());
            String operation = stack.pop();
            int left = Integer.parseInt(stack.pop());
           // int result = Integer.parseInt(stack.pop());

            switch (operation){
                case "+": stack.push(String.valueOf(right + left));
                break;

                case "-": stack.push(String.valueOf(right - left));
                break;
            }
        }
        System.out.println(stack.pop());


      //  String[] input = scanner.nextLine().split("\\s+");



//        for (String s: input) {
//            stack.push(s);
//        }
    }
}
