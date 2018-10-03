package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

@Test
public void whenFirstLessSecond() {
    Max maximum = new Max();
    int result = maximum.max(1, 2);
    assertThat(result, is(2));
}

@Test
public void whenSecondLessFirst() {
    Max maximum = new Max();
    int result = maximum.max(5, 10);
    assertThat(result, is(10));
} 
@Test
public void whenFirstLessSecondandThird() {
    Max maximum = new Max();
    int result = maximum.maxofthree(5, 10, 20);
    assertThat(result, is(20));
} 
@Test
public void whenSecondLessFirstandThird() {
    Max maximum = new Max();
    int result = maximum.maxofthree(25, 10, 20);
    assertThat(result, is(25));
} 
    }

 
