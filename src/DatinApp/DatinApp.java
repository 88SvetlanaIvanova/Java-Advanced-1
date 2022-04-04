//package DatinApp;
//
//import javax.sound.midi.MidiFileFormat;
//import java.util.ArrayDeque;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//
//public class DatinApp {
//    public static void main(String[] args) {
//        //to read te queue and te stack
//        Scanner scanner = new Scanner(System.in);
//        ArrayDeque<Integer> maleStack = new ArrayDeque<>();
//
//        Arrays.stream(scanner.nextLine().split("\\s+"))
//                .map(Integer::parseInt)
//                .forEach(maleStack::push);
//
//        ArrayDeque<Integer> femQueue = Arrays.stream(scanner.nextLine()
//                .split("\\s+"))
//                .map(Integer::parseInt)
//                .collect(Collectors.toCollection(ArrayDeque::new));
//        int matches = 0;
//        int currentMale;
//        int currentFem = 0;
//        while (!maleStack.isEmpty() && !femQueue.isEmpty()) {
//            currentMale = maleStack.peek();
//            currentFem = femQueue.peek();
//
//
//
//
//
//
//              if (isNegativeOrZero(currentFem)&& !femQueue.isEmpty()) {
//                  femQueue.poll();
//                  currentFem = femQueue.peek();
//
//              }
//               if(isNegativeOrZero(currentMale) && !maleStack.isEmpty()) {
//                 maleStack.pop();
//                 currentMale = maleStack.peek();
//              }
//
//              if (divisibleBy(currentMale) ) {
//                maleStack.pop();
//                maleStack.pop();
//              }
//              if (divisibleBy(currentFem) ){
//
//                femQueue.poll();
//                femQueue.poll();
//              }
//
//              if (  !maleStack.isEmpty() && !femQueue.isEmpty() ){
//
//                   if (currentFem == currentMale) {
//                    maleStack.pop();
//                   // femQueue.remove();
//                    matches++;
//
//                    }else {
//                      // femQueue.poll();
//
//                       int updateMale = currentMale - 2;
//                       if (updateMale > 0) {
//                        maleStack.push(updateMale);
//                        }else {
//                           maleStack.pop();
//                       }
//                          }
//               }
//
//
//            }
//
//       // System.out.println(maleStack.pop());
//       // System.out.println(femQueue.poll());
//        System.out.println("Matches: "+matches);
//       // System.out.println(getElementsInfo(maleStack));
//     //   System.out.println(getElementsInfo(femQueue));
//
//        if (femQueue.isEmpty()){
//            System.out.println("Females left: none");
//        }else {System.out.print("Females left: ");
//            System.out.println(getElementsInfo(femQueue));
//
//
//
//        }
//
//        if (maleStack.isEmpty()){
//            System.out.println("Males left: none");
//        }else{
//            System.out.print( "Males left: " );
//            System.out.println(getElementsInfo(maleStack));
//        }
//
//
//
//      }
//
//
//
//
//
//
//
//
//
//    public static String getElementsInfo(ArrayDeque<Integer> deque) {
//        return deque
//                .stream()
//                .map(String::valueOf)
//                .collect(Collectors.joining(", "));
//    }
//
//
//    public static boolean divisibleBy(int person){
//        return person % 25 == 0 ;
//
//    }
//    public static boolean checkTheNumber(int numberQ, ArrayDeque<Integer> queue ){
//        if (numberQ <= 0 && !queue.isEmpty()) {
//
//            return false;
//
//        }
//
//        if (divisibleBy(numberQ) ){
//
//           return  false;
//        }
//
//
//
//        return true;
//    }
//    public static boolean checkStack(int numberS , ArrayDeque<Integer> stack){
//        if(numberS <=0 && !stack.isEmpty()) {
//            return  false;
//        }
//
//        if (divisibleBy(numberS) ) {
//           return false;
//        }
//        return true;
//    }
//
//}
