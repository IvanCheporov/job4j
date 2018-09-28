package ru.job4j.converter;

/**
 * Корвертор валюты с определенной переменной value.
 */
public class Converter {

    /**
     * Конвертируем Рубли в Евро.
     * @param value Рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
		return value / 70;
    }
    /**
     * Конвертируем Рубли в Доллары.
     * @param value Рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
		return value / 60;
    }
	/**
     * Конвертируем Евро в рубли.
     * @param value Евро.
     * @return Рубли.
     */
	public int euroToruble(int value) {   
		return value * 70;
    }
	/**
     * Конвертируем Доллары в рубли.
     * @param value Доллары.
     * @return Рубли.
     */
	public int dollarToruble(int value) { 
		return value * 70;
    }
}