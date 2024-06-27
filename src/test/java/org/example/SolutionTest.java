package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findClosestElementsTest() {
        Solution solution = new Solution();
        List<Integer> output = new ArrayList<>();
        output.addAll(Arrays.asList(1, 2, 3, 4));
        Assert.assertEquals(output,
                solution.findClosestElements(new int[]{1,2,3,4,5}, 4, 3));
        output = new ArrayList<>();
        output.addAll(Arrays.asList(1, 2, 3, 4));
        Assert.assertEquals(output,
                solution.findClosestElements(new int[]{1,2,3,4,5}, 4, -1));
    }
}