package week_2.HashMapsAndHashSets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * SOLVED
 */
public class IntersectionOfTwoArraysSOLVED {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();

        for(int num : nums1) {
            nums1Set .add(new Integer(num));
        }

        List<Integer> sameNums = new ArrayList<>();

        for(int num : nums2) {
            Integer current = new Integer(num);
            if(nums1Set.contains(current)) {
                if(!sameNums.contains(current)) {
                    sameNums.add(current);
                }
            }
        }

        int[] finalSameNums = new int[sameNums.size()];
        for (int i = 0; i < sameNums.size(); i++) {
            finalSameNums[i] = sameNums.get(i);
        }


        return finalSameNums;

    }

}
