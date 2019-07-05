package week_2.HashMapsAndHashSets;

import java.util.ArrayList;
import java.util.List;

/**
 * SOLVED
 */
public class DesignHashSetSOLVED {
    /**
     * Your MyHashSet object will be instantiated and called as such:
     * MyHashSet obj = new MyHashSet();
     * obj.add(key);
     * obj.remove(key);
     * boolean param_3 = obj.contains(key);
     */
    class MyHashSet {
        List<Integer> list;

        /** Initialize your data structure here. */
        public MyHashSet() {
            list = new ArrayList<>();
        }

        public void add(int key) {
            if(list.size() > 0) {
                if(!list.contains(key)) {
                    list.add(key);
                }
            } else {
                list.add(new Integer(key));
            }
        }

        public void remove(int key) {
            if(list.size() > 0) {
                if(list.contains(key)) {
                    list.remove(new Integer(key));
                }
            }
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            if(list.size() > 0) {
                if(list.contains(new Integer(key))) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

}
