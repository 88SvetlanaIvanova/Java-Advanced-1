import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forwardPages = new ArrayDeque<>();
        String navigation;



        while (!"Home".equals(navigation = scanner.nextLine())){
            if (navigation.equals("back")){
                if (history.size() < 2){
                    System.out.println("no previous URLs");
                }else{
                    forwardPages.addFirst(history.peek());
                    history.pop();
                    System.out.println(history.peek());
                }


            }
            else if (navigation.equals("forward")){
                    if (forwardPages.size()< 1){
                        System.out.println("no next URLs");
                    }else{
                        System.out.println(forwardPages.peek());
                        history.push(forwardPages.pop());
                    }


            }
            else {
                System.out.println(navigation);
                history.push(navigation);
                forwardPages.clear();
            }


        }


    }
}
