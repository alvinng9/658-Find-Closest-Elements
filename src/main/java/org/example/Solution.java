package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            if (Math.abs(a - x) == Math.abs(b - x)) {
                return a - b;
            } else {
                return Math.abs(a - x) - Math.abs(b - x);
            }
        });
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            pq.offer(arr[i]);
        }
        for (int i = 0; i < k; i++) {
            result.add(pq.remove());
        }
        Collections.sort(result);
        return result;
    }
}
