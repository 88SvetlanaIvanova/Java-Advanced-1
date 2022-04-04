import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class FourBasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        //N the number of elements to push into the stack, an integer S representing the number of elements to
        // pop from the stack and finally an integer X, an element that you should check whether is present in the stack.
        // If it is, print "true" on the console. If it’s not, print the smallest element currently present in the stack.
        //N the number of elements to push into the stack,
        for (int count = 1; count < n; count++) {
            queue.offer(scanner.nextInt());
        }
        //an integer S representing the number of elements to pop from the stack
        for (int count = 1; count <= s ; count++) {
            queue.poll();
        }
        //integer X, an element that you should check whether is present in the stack.
        if (queue.contains(x)){
            System.out.println("true");

        }else{

            //min element
            if (!queue.isEmpty()){
                //min element
                System.out.println(Collections.min(queue));
            }else{
                System.out.println(0);
            }
        }
    }
}
