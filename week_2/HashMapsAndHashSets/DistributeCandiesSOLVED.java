package week_2.HashMapsAndHashSets;

import java.util.HashMap;
import java.util.Map;

/**
 * SOLVED
 */
public class DistributeCandiesSOLVED {
    public int distributeCandies(int[] candies) {

        Map<Integer, Integer> candyKinds = new HashMap<>();
        for(int candy : candies) {
            Integer currentCandy = new Integer(candy);
            if(candyKinds.containsKey(currentCandy)) {
                Integer newCount = new Integer(candyKinds.get(currentCandy)+1);
                candyKinds.put(currentCandy, newCount);
            } else {
                candyKinds.put(currentCandy, 1);
            }
        }

        int totalSisterKinds = 0;

        if(candyKinds.size() > (candies.length/2)) {
            totalSisterKinds = candies.length/2;
        } else {
            totalSisterKinds = candyKinds.size();
        }

        return totalSisterKinds;
    }
}
