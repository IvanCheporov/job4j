package ru.job4j.loop;

/**
 *Программа подсчета суммы чётных чисел в диапазоне 1..10.
 */
public class Counter {

    /**
     * @author Ivan Cheporov (vanessok@mail.ru).
     * @param диапазон(start and finish).
     * @since 05.10.2018.
     * @return result.
     */
    public int add(int start, int finish) {
		int result = 0;
        for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
				res += i;
			}
		}
		return result;
	}

}