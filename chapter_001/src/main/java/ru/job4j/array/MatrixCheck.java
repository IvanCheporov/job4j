package ru.job4j.array;
/**
 * @author Ivan Cheporov (vanessok@mail.ru)
 * @version $2.0$
 * @since 02.11.2018.
 */

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
    boolean result = true;
    for (int i = 0; i < data.length; i++) {
        if (data[0][0] != data[i][i]) {// проверяем первую диагональ
            result = false;
            break;
        }

        if  (data[i - 1][data.length - i] != data[i][data.length - i - 1])) {//напиши тут индексы второй диагонали
            result = false;
            break;
        }
    }
    return result;
}

