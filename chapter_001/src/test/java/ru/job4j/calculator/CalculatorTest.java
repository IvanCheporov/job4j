package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Ivan Cheporov (mailto:vanessok@mail.ru).
* @version $1.0$.
* @since 24.09.2018.
*/

public class CalculatorTest {
/**
* Test of the method whenAddTwoPlusTwoThenFour().
*/
    @Test
    public void whenAddTwoPlusTwoThenFour() {
        Calculator calc = new Calculator();
        calc.add(2, 2);
        double result = calc.getResult();
        double expected = 4;
        assertThat(result, is(expected));
    }
/**
* Test of the method whenThreeSubstractOneThenTwo().
*/
	@Test
    public void whenThreeSubstractOneThenTwo() {
        Calculator calc = new Calculator();
        calc.subtract(3, 1);
        double result = calc.getResult();
        double expected = 2;
        assertThat(result, is(expected));
/*
 Test of the method whenTenDivTenThenOne().
*/		
    }
	@Test
    public void whenTenDivTenThenOne() {
        Calculator calc = new Calculator();
        calc.div(10, 10);
        double result = calc.getResult();
        double expected = 1;
        assertThat(result, is(expected));
    }
	/**
* Test of the method whenTenMultipleTenThenHundred().
*/	
	@Test
    public void whenTenMultipleTenThenHundred() {
        Calculator calc = new Calculator();
        calc.multiple(10, 10);
        double result = calc.getResult();
        double expected = 100;
        assertThat(result, is(expected));
    }
	
}