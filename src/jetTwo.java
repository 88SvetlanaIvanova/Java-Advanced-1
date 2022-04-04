import java.sql.SQLOutput;
import java.util.Scanner;

public class jetTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! My name is Aid.\n" +
                "I was created in 2020.");
        System.out.println("Please, remind me your name.");
        String name = scanner.nextLine();
        System.out.printf("What a great name you have, %s!", name);
        System.out.println("Let me guess your age.\n" +
                "Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = Integer.parseInt(scanner.nextLine());
        int remainder5 = Integer.parseInt(scanner.nextLine());
        int remainder7 = Integer.parseInt(scanner.nextLine());
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.printf("Your age is %d; that's a good time to start programming!", age);

    }
}
