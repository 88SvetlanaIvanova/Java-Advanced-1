package OpinionPoll;

import java.io.*;
import java.util.*;

import static java.lang.System.out;

public class file {
    public static void main(String[] args) {
        //System.currentTimeMillis() .trim() and .equals()
        Map<String, Integer> hash = new LinkedHashMap<>();
        File f = new File("E:\\My Documents\\00MyJavaProject00\\src\\small_directory.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            int count = 0;
            String str;
            while ((str = br.readLine()) != null) {
                int value = Integer.parseInt(str);
                if (value == 0) {
                    break;
                } else if ((value & 1) == 0) {
                    count++;
                }
            }
            out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
