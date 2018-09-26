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
    public int rubleToEuro(int value, int course) {
        int value = 70;
		int course = 70;
		int euro = value / course;
		return euro;
    }
    /**
     * Конвертируем Рубли в Доллары.
     * @param value Рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value, int course) {
        int value = 60;
		int course = 60;
		dollar = value / course;
		return dollar;
    }
	/**
     * Конвертируем Евро в рубли.
     * @param value Евро.
     * @return Рубли.
     */
	public int euroToruble(int value, int course) {
        int value = 3;
		int course = 70;
		int euroTorub = value * course;
		return euroTorub;
    }
	/**
     * Конвертируем Доллары в рубли.
     * @param value Доллары.
     * @return Рубли.
     */
	public int dollarToruble(int value, int course) {
        int value = 3;
		int course = 60;
		int dollarTorub = value * course;
		return dollarTorub;
    }
}