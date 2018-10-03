package ru.job4j.max;

/**
 * Программа, возвращающая максимум из двух чисел first and second.
 */
public class Max {

    /**
     * Метод max, возвращающий максимум из двух чисел first and second.
     * @param first, second числа.
     * @return max.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }
	/**
     * Метод maxofthree, возвращающий максимум из трех чисел first, second, third.
     * @param first, second, third числа.
     * @return maxofthree.
     */
	public int maxofthree(int first, int second, int third) {
        int temp = this.max(this.max(first, second), third);
        return temp;
	}
}

