package week_2.HashMapsAndHashSets;

import java.util.ArrayList;
import java.util.List;

/**
 * SOLVED
 */
public class DesignHashMapSOLVED {
    /**
     * Your MyHashMap object will be instantiated and called as such:
     * MyHashMap obj = new MyHashMap();
     * obj.put(key,value);
     * int param_2 = obj.get(key);
     * obj.remove(key);
     */
    class MyHashMap {
        List<List<Integer>> list;

        /** Initialize your data structure here. */
        public MyHashMap() {
            list = new ArrayList<>();
        }

        /** value will always be non-negative. */
        public void put(int key, int value) {
            boolean exists = false;
            if(list.size() > 0) {
                for(int i = 0; i < list.size(); i++) {
                    if(list.get(i).get(0) == key) {
                        list.get(i).set(1, value);
                        exists = true;
                        break;
                    }
                }
                if(!exists) {
                    List<Integer> newList = new ArrayList<>();
                    newList.add(key);
                    newList.add(value);
                    list.add(newList);
                }
            } else {    //if the size isn't greater than 0 add the first element
                List<Integer> newList = new ArrayList<>();
                newList.add(key);
                newList.add(value);
                list.add(newList);
            }
        }

        /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
        public int get(int key) {
            if(list.size() > 0) {
                for(int i = 0; i < list.size(); i++) {
                    if(list.get(i).get(0) == key) {
                        return list.get(i).get(1);
                    }
                }
            }

            return -1;
        }

        /** Removes the mapping of the specified value key if this map contains a mapping for the key */
        public void remove(int key) {
            boolean exists = false;
            if(list.size() > 0) {
                for(int i = 0; i < list.size(); i++) {
                    if(list.get(i).get(0) == key) {
                        list.remove(i);
                        break;
                    }
                }
            }
        }
    }

}
