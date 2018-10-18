package ru.job4j.array;

/**
 * @author Ivan Cheporov (vanessok@mail.ru)
 * @version $1.0$
 * @since 18.10.2018.
 */

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}