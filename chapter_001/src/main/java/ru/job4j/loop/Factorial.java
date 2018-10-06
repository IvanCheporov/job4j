package ru.job4j.loop;

/**
 *Программа, вычисляющую факториал.
 */
public class Factorial {

	/**Метод calc возвращает факториал числа n
	 * @author Ivan Cheporov (vanessok@mail.ru).
     * @since 06.10.2018.
	 * @param n - число.
	 * @return factorial.
	 */
	public int calc(int n) {
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		
                return factorial;
	
	}


  }
