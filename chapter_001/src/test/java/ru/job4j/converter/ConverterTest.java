package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
	 /**
     * Тестируем конвертацию Рублей в Доллары.
     */
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }
     /**
     * Тестируем конвертацию Рублей в Евро.
     */
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }
	/**
     * Тестируем конвертацию Евро в Рубли.
     */
	 @Test
    public void when3EuroToRubleThen210() {
        Converter converter = new Converter();
        int result = converter.euroToruble(70);
        assertThat(result, is(210));
    }
	/**
     * Тестируем конвертацию Долларов в Рубли.
     */
	 @Test
    public void when3DollarsToRubleThen180() {
        Converter converter = new Converter();
        int result = converter.dollarToruble(60);
        assertThat(result, is(180));
    }
}