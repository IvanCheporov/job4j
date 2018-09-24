package ru.job4j.calculator;

/**
 * calculator.
 *
 * @author Ivan Cheporov (mailto:vanessok@mail.ru).
 * @version $1.0$.
 * @since 24.09.2018.
 */

public class Calculator {
	/**
     * Main class for calculate.
     */
    private double result;
	/**
     * field for save result.
	 *@param result - result.
     */
	
    /**
     * Method add.
     * @param first, second.
     * @return result = first + second.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     * Method subtract.
     * @param first, second.
     * @return result = first-second.
     */
	public void subtract(double first, double second) {
		this.result = first-second;
	}
	/**
     * Method div.
     * @param first, second.
     * @return result = first/second.
     */
	public void div (double first, double second) {
		this.result = first/second;
	}
	/**
     * Method multiple.
     * @param first, second.
     * @return result = first*second.
     */
	public void multiple (double first, double second) {
		this.result = first*second;
	}
	/**
     * Method getResult().
     * @return result.
     */
    public double getResult() {
        return this.result;
    }
}