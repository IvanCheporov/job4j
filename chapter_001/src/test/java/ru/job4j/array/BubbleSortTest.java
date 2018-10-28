﻿package ru.job4j.array;
/**
 * @author Ivan Cheporov (vanessok@mail.ru)
 * @version $1.0$
 * @since 28.10.2018.
 */

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubblesort = new BubbleSort();
        int[] input = new int[] {1, 5, 4, 2, 3, 7, 8, 0, 5};
        int[] result = bubblesort.sort(input);
        int[] expect = new int[] {0, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, is(expect));
    }
}