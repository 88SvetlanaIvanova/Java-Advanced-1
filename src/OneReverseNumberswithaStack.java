import java.util.ArrayDeque;
import java.util.Scanner;

public class OneReverseNumberswithaStack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+") ;
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (String number : input) {
                stack.push(number);
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }


//        ArrayDeque<Integer> stack = new ArrayDeque<>();
//        //add
//        stack.push(5);
//        stack.push(6);
//        stack.push(15);
//        //remove (last element) and returns the value
//        stack.pop();
//
//        //peek, returns, not removes
//        System.out.println(stack.peek());
    }
}
