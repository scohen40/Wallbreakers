package week_2.MultiSets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SOLVED
 */
public class SetMismatchSOLVED {
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            Integer n = num;
            if(!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                Integer newCount = map.get(n) + 1;
                map.put(n, newCount);
            }
        }

        List<Integer> list = new ArrayList<>();
        for(Integer i = 1; i <= nums.length; i++) {
            if(!map.containsKey(i)) {
                list.add(i);
            } else if(map.get(i) > 1) {
                list.add(0, i);
            }
        }

        int[] arr = {list.get(0), list.get(1)};
        return arr;
    }
}
