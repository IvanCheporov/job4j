package ru.job4j.array;
/**
 * @author Ivan Cheporov (vanessok@mail.ru)
 * @version $2.0$
 * @since 02.11.2018.
 */

public class MatrixCheck {
    /**
     * @param data
     * @return
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0][0] != data[i][i]) {// проверяем первую диагональ
                result =  false;
                break;
            }

            if ((data[i - 1][data.length - i] != data[i][data.length - i - 1])) {// проверяем дальше по диагоналям
                result = false;
                break;
            }
        }
        return result;
    }
}