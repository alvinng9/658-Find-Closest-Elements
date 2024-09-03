package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        //create a priority queue that would sort integers in way that is
        //closest to the given int x
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            if (Math.abs(a - x) == Math.abs(b - x)) {
                return a - b;
            } else {
                return Math.abs(a - x) - Math.abs(b - x);
            }
        });
        //create the list of integers
        List<Integer> result = new ArrayList<>();

        //iterate through the given array and add all nums to the priority queue
        for (int num : arr) {
            pq.offer(num);
        }

        //add the k closest nums to the result list
        for (int i = 1; i <= k; i++) {
            result.add(pq.remove());
        }
        //sort the list result
        Collections.sort(result);
        return result;
    }
}
