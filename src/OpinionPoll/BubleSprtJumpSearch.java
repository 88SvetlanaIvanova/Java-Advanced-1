package OpinionPoll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubleSprtJumpSearch implements Algorithm {
    private final List<String> phoneBook;
    private final List<String> namesToSearch;
    long timeTakenToSearch;
    long timeTakenToSort;
    int phoneNumbersFound = 0;
    static boolean isSortingTakingTooMuchTime = false;



    public BubleSprtJumpSearch(List<String> phoneBook, List<String> namesToSearch) {
        this.phoneBook = phoneBook;
        this.namesToSearch = namesToSearch;
    }

    @Override
    public void start() {
        bubbleSort();
        if (isSortingTakingTooMuchTime) {
            long startingTime = System.currentTimeMillis();
            new LinearSearch(phoneBook, namesToSearch).linearSearch();
            phoneNumbersFound = LinearSearch.phoneNumbersFound;
            timeTakenToSearch = System.currentTimeMillis() - startingTime;
        }
        Algorithm.printStats(phoneNumbersFound, timeTakenToSort, timeTakenToSearch, true, isSortingTakingTooMuchTime);
    }


    private void bubbleSort()
    {
        long startingTime = System.currentTimeMillis();
        System.out.println("Start searching (bubble sort + jump search)...");

        for (int i = 0; i < phoneBook.size() - 1; i++)
            for (int j = 0; j < phoneBook.size()- i - 1; j++)

                if (phoneBook.get(j).compareTo(phoneBook.get(j+1)) > 0 )
                {
                    // swap arr[j+1] and arr[j]
                    Collections.swap(phoneBook, j , j + 1);
                    timeTakenToSort = System.currentTimeMillis() - startingTime;
                }
    }


}
