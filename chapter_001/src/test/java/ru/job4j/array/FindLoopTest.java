package ru.job4j.array;
/**
 * @author Ivan Cheporov (vanessok@mail.ru)
 * @version $1.0$
 * @since 18.10.2018.
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHasLengh5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHasValue9ThenNotFind() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 9;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
        System.out.println(expect);
    }
}