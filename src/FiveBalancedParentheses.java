import java.util.ArrayDeque;
import java.util.Scanner;

public class FiveBalancedParentheses {
    public static void main(String[] args) {
        // poslednata otworena sywpada s poslednata zatworena
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<Character> openBrackets = new ArrayDeque<>();
        boolean areBalanced = false;
        for (int index = 0; index < input.length(); index++) {
            char currentBracket = input.charAt(index);
            // check if brackets are open
            if (currentBracket == '('|| currentBracket == '[' || currentBracket =='{'){
                openBrackets.push(currentBracket);
            }// check if brackets are closed
            else if(currentBracket == ')'|| currentBracket == ']' || currentBracket =='}'){
                // current bracket is last closed bracket
                // check if this closed bracket is matching the last one open
                if (openBrackets.isEmpty()){
                    areBalanced = false;
                    break;
                }
                char lastOpenBracket = openBrackets.pop();// last open
                //last open and closed
                if (lastOpenBracket == '(' && currentBracket == ')'){
                areBalanced = true;
                }
                else if (lastOpenBracket == '[' && currentBracket == ']'){
                    areBalanced = true;
                }
                else if (lastOpenBracket == '{' && currentBracket == '}'){
                    areBalanced = true;
                }else{
                    // no balance
                    areBalanced = false;
                    break;
                }

            }
        }

        // check if we have all balanced
        if (areBalanced){
            System.out.println("YES");

        }else{
            System.out.println("NO");
        }

    }
}
