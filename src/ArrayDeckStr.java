import java.util.ArrayDeque;//Printer Queue
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayDeckStr {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            ArrayDeque<String> queue = new ArrayDeque<>();
            String task = scanner.nextLine();

            while (!task.equals("print")){


                if (task.equals("cancel")){
                    if (queue.isEmpty()){
                        System.out.println("Printer is on standby");
                    }else{
                        String cancelledTask = queue.poll();
                        System.out.println("Canceled " + cancelledTask);
                    }

                }else {
                    queue.offer(task);
                }
                task = scanner.nextLine();

            }
            while(!queue.isEmpty()){
                System.out.println(queue.poll());
            }

//            queue.stream().map(String::valueOf)
//                    .collect(Collectors.joining(System.lineSeparator()));

//        for (String file: queue) {
//            System.out.println(file);
//
//        }
    }
}
