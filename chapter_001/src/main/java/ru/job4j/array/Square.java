package ru.job4j.array;

/**
 * @author Ivan Cheporov (vanessok@mail.ru)
 * @version $1.0$
 * @since 16.10.2018.
 */
public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
	 // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат.
        for (int i = 0; i < bound; i++) {
            rst[i] = (int) Math.pow(i + 1, 2);
            System.out.println(rst[i]);
        }
        return rst;
    }
}