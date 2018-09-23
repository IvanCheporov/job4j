package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddTwoPlusTwoThenFour() {
        Calculator calc = new Calculator();
        calc.add(2, 2);
        double result = calc.getResult();
        double expected = 4;
        assertThat(result, is(expected));
    }
	@Test
    public void whenThreeSubstractOneThenTwo() {
        Calculator calc = new Calculator();
        calc.substract(3, 1);
        double result = calc.getResult();
        double expected = 2;
        assertThat(result, is(expected));
    }
	@Test
    public void whenTenDivTenThenOne() {
        Calculator calc = new Calculator();
        calc.div(10, 10);
        double result = calc.getResult();
        double expected = 1;
        assertThat(result, is(expected));
    }
	@Test
    public void whenTenMultipleTenThenHundred() {
        Calculator calc = new Calculator();
        calc.multiple(10, 10);
        double result = calc.getResult();
        double expected = 100;
        assertThat(result, is(expected));
    }
	
}