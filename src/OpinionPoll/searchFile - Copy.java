package OpinionPoll;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.System.out;

class searchFile1 {
    public static void main(String[] args) {

        long timeTakenToSearch;
        long startingTime = 0;
        //System.currentTimeMillis() .trim() and .equals()
        File g = new File("C:\\Users\\Svetla\\Documents\\Java-Advanced-Classes\\src\\OpinionPoll\\find.txt");
        File f = new File("C:\\Users\\Svetla\\Documents\\Java-Advanced-Classes\\src\\OpinionPoll\\directory.txt");
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));

            BufferedReader brg = new BufferedReader(new FileReader(g));

            String str;
            String strG;
            ArrayList<String> phoneBook = new ArrayList();
            ArrayList<String> gFind = new ArrayList();
            while ((strG = brg.readLine()) != null) {
                gFind.add(strG.trim());
            }
            while ((str = br.readLine()) != null) {

                String[] input = str.trim().split(" ", 2);
                String strF = input[1];
                phoneBook.add(strF);
                //  strG = brg.readLine();
            }

            startingTime = System.currentTimeMillis();

            for (String name : gFind) {
                for (String phoneBookEntry : phoneBook) {
                    if (phoneBookEntry.contains(name)) {
                        count++;
                        break;
                    }
                }
            }

            //out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("Start searching...\n" +
                "Found %d / %d entries. " + "Time taken: ", count, count);
        timeTakenToSearch = System.currentTimeMillis() - startingTime;

        System.out.println(convertToRegularTime(timeTakenToSearch));

    }

    static String convertToRegularTime(long durationInMilliseconds) {
        long minutes = (durationInMilliseconds / 1000) / 60;
        long seconds = (durationInMilliseconds / 1000) % 60;
        long millis = durationInMilliseconds - seconds * 1000;
        return String.format("%2d min. %2d sec. %2d ms.", minutes, seconds, millis);
    }
}
