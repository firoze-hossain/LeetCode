package com.leetcode.topInterview150.insertDeleteGetRandomOOne;

import java.util.*;

public class InsertDeleteGetRandomOOne {
    private Set<Integer> set;
    private Random random;

    InsertDeleteGetRandomOOne() {
        set = new HashSet<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (!set.contains(val)) {
            set.add(val);
            return true;
        }

        return false;
    }

    public boolean remove(int val) {
        if (set.contains(val)) {
            set.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        List<Integer> list = new ArrayList<>(set);
        int ran = random.nextInt(list.size());
        return list.get(ran);
    }

}

